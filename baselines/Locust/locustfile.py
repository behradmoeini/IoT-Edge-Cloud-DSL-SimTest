import time
import random
from locust import User, task, between
import socket
import threading

class UDPUser(User):

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
        self.server_address = ('192.168.1.1', 8620)
        self.user = {} # initialize the user attribute
        self.start_time = time.time()
        self.requests_sent = 0
        self.gap_count = 0
        self.gap_start_time = self.start_time
        self.running = True

    def on_start(self):
        self.data_thread = threading.Thread(target=self.receive_data)
        self.data_thread.start()

    def on_stop(self):
        if self.data_thread is not None:
            self.running = False  # set running to False to stop the thread
            self.data_thread.join()
        self.sock.close()
        return

    def receive_data(self):
        while self.running:
            data, server = self.sock.recvfrom(4096)
            # Process received data here
        return

    @task
    def send_udp_request(self):
        if time.time() - self.start_time > 2 or self.gap_count >= 4:
           self.environment.runner.quit()
        message_num = self.user.get('message_num', 0)
        message = str(random.randint(10000000, 99999999))
        self.sock.sendto(message.encode(), self.server_address)
        self.user['message_num'] = message_num + 1
        self.requests_sent += 1
        
        if self.requests_sent % 100 == 0 and self.gap_count < 4:
            self.gap_count += 1
            time_elapsed = time.time() - self.gap_start_time
            if time_elapsed < 0.5:
               time.sleep(0.5 - time_elapsed)
            self.gap_start_time = time.time()

