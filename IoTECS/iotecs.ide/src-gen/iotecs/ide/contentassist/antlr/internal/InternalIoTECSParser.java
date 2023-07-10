package iotecs.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import iotecs.services.IoTECSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIoTECSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Max'", "'ms'", "'s'", "'m'", "'h'", "'b'", "'Mb'", "'Kb'", "'UDP'", "'TCP'", "'Docker'", "'VM'", "'Native'", "'Platform:'", "'{'", "'type:'", "'networkAdapter:'", "'}'", "'locationIP:'", "'userName:'", "'password:'", "'cpu:'", "'memory:'", "'G'", "'ipVM:'", "'userNameVM:'", "'passwordVM:'", "'Simulator:'", "'duration:'", "'step:'", "'simulationNodes:'", "'Cloud:'", "'ip:'", "'port:'", "'usrname:'", "'workload:'", "'SimulationNode:'", "'platform:'", "'EdgeDevices:'", "'['", "']'", "','", "'EdgeDevice:'", "'protocol:'", "'speed:'", "'cloud:'", "'devices:'", "'Device:'", "'period:'", "'payload:'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIoTECSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIoTECSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIoTECSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIoTECS.g"; }


    	private IoTECSGrammarAccess grammarAccess;

    	public void setGrammarAccess(IoTECSGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalIoTECS.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalIoTECS.g:54:1: ( ruleModel EOF )
            // InternalIoTECS.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalIoTECS.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalIoTECS.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalIoTECS.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalIoTECS.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalIoTECS.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24||LA1_0==38||LA1_0==42||LA1_0==47||LA1_0==53||LA1_0==58) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIoTECS.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalIoTECS.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalIoTECS.g:79:1: ( ruleElement EOF )
            // InternalIoTECS.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalIoTECS.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalIoTECS.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalIoTECS.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalIoTECS.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalIoTECS.g:94:3: ( rule__Element__Alternatives )
            // InternalIoTECS.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePlatform"
    // InternalIoTECS.g:103:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // InternalIoTECS.g:104:1: ( rulePlatform EOF )
            // InternalIoTECS.g:105:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalIoTECS.g:112:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:116:2: ( ( ( rule__Platform__Group__0 ) ) )
            // InternalIoTECS.g:117:2: ( ( rule__Platform__Group__0 ) )
            {
            // InternalIoTECS.g:117:2: ( ( rule__Platform__Group__0 ) )
            // InternalIoTECS.g:118:3: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // InternalIoTECS.g:119:3: ( rule__Platform__Group__0 )
            // InternalIoTECS.g:119:4: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleSimulator"
    // InternalIoTECS.g:128:1: entryRuleSimulator : ruleSimulator EOF ;
    public final void entryRuleSimulator() throws RecognitionException {
        try {
            // InternalIoTECS.g:129:1: ( ruleSimulator EOF )
            // InternalIoTECS.g:130:1: ruleSimulator EOF
            {
             before(grammarAccess.getSimulatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSimulator();

            state._fsp--;

             after(grammarAccess.getSimulatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimulator"


    // $ANTLR start "ruleSimulator"
    // InternalIoTECS.g:137:1: ruleSimulator : ( ( rule__Simulator__Group__0 ) ) ;
    public final void ruleSimulator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:141:2: ( ( ( rule__Simulator__Group__0 ) ) )
            // InternalIoTECS.g:142:2: ( ( rule__Simulator__Group__0 ) )
            {
            // InternalIoTECS.g:142:2: ( ( rule__Simulator__Group__0 ) )
            // InternalIoTECS.g:143:3: ( rule__Simulator__Group__0 )
            {
             before(grammarAccess.getSimulatorAccess().getGroup()); 
            // InternalIoTECS.g:144:3: ( rule__Simulator__Group__0 )
            // InternalIoTECS.g:144:4: rule__Simulator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simulator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimulatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimulator"


    // $ANTLR start "entryRuleCloud"
    // InternalIoTECS.g:153:1: entryRuleCloud : ruleCloud EOF ;
    public final void entryRuleCloud() throws RecognitionException {
        try {
            // InternalIoTECS.g:154:1: ( ruleCloud EOF )
            // InternalIoTECS.g:155:1: ruleCloud EOF
            {
             before(grammarAccess.getCloudRule()); 
            pushFollow(FOLLOW_1);
            ruleCloud();

            state._fsp--;

             after(grammarAccess.getCloudRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCloud"


    // $ANTLR start "ruleCloud"
    // InternalIoTECS.g:162:1: ruleCloud : ( ( rule__Cloud__Group__0 ) ) ;
    public final void ruleCloud() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:166:2: ( ( ( rule__Cloud__Group__0 ) ) )
            // InternalIoTECS.g:167:2: ( ( rule__Cloud__Group__0 ) )
            {
            // InternalIoTECS.g:167:2: ( ( rule__Cloud__Group__0 ) )
            // InternalIoTECS.g:168:3: ( rule__Cloud__Group__0 )
            {
             before(grammarAccess.getCloudAccess().getGroup()); 
            // InternalIoTECS.g:169:3: ( rule__Cloud__Group__0 )
            // InternalIoTECS.g:169:4: rule__Cloud__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCloud"


    // $ANTLR start "entryRuleSimulationNode"
    // InternalIoTECS.g:178:1: entryRuleSimulationNode : ruleSimulationNode EOF ;
    public final void entryRuleSimulationNode() throws RecognitionException {
        try {
            // InternalIoTECS.g:179:1: ( ruleSimulationNode EOF )
            // InternalIoTECS.g:180:1: ruleSimulationNode EOF
            {
             before(grammarAccess.getSimulationNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleSimulationNode();

            state._fsp--;

             after(grammarAccess.getSimulationNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimulationNode"


    // $ANTLR start "ruleSimulationNode"
    // InternalIoTECS.g:187:1: ruleSimulationNode : ( ( rule__SimulationNode__Group__0 ) ) ;
    public final void ruleSimulationNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:191:2: ( ( ( rule__SimulationNode__Group__0 ) ) )
            // InternalIoTECS.g:192:2: ( ( rule__SimulationNode__Group__0 ) )
            {
            // InternalIoTECS.g:192:2: ( ( rule__SimulationNode__Group__0 ) )
            // InternalIoTECS.g:193:3: ( rule__SimulationNode__Group__0 )
            {
             before(grammarAccess.getSimulationNodeAccess().getGroup()); 
            // InternalIoTECS.g:194:3: ( rule__SimulationNode__Group__0 )
            // InternalIoTECS.g:194:4: rule__SimulationNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimulationNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimulationNode"


    // $ANTLR start "entryRuleSimulationNodes"
    // InternalIoTECS.g:203:1: entryRuleSimulationNodes : ruleSimulationNodes EOF ;
    public final void entryRuleSimulationNodes() throws RecognitionException {
        try {
            // InternalIoTECS.g:204:1: ( ruleSimulationNodes EOF )
            // InternalIoTECS.g:205:1: ruleSimulationNodes EOF
            {
             before(grammarAccess.getSimulationNodesRule()); 
            pushFollow(FOLLOW_1);
            ruleSimulationNodes();

            state._fsp--;

             after(grammarAccess.getSimulationNodesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimulationNodes"


    // $ANTLR start "ruleSimulationNodes"
    // InternalIoTECS.g:212:1: ruleSimulationNodes : ( ( rule__SimulationNodes__Group__0 ) ) ;
    public final void ruleSimulationNodes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:216:2: ( ( ( rule__SimulationNodes__Group__0 ) ) )
            // InternalIoTECS.g:217:2: ( ( rule__SimulationNodes__Group__0 ) )
            {
            // InternalIoTECS.g:217:2: ( ( rule__SimulationNodes__Group__0 ) )
            // InternalIoTECS.g:218:3: ( rule__SimulationNodes__Group__0 )
            {
             before(grammarAccess.getSimulationNodesAccess().getGroup()); 
            // InternalIoTECS.g:219:3: ( rule__SimulationNodes__Group__0 )
            // InternalIoTECS.g:219:4: rule__SimulationNodes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNodes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimulationNodesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimulationNodes"


    // $ANTLR start "entryRuleEdgeDevice"
    // InternalIoTECS.g:228:1: entryRuleEdgeDevice : ruleEdgeDevice EOF ;
    public final void entryRuleEdgeDevice() throws RecognitionException {
        try {
            // InternalIoTECS.g:229:1: ( ruleEdgeDevice EOF )
            // InternalIoTECS.g:230:1: ruleEdgeDevice EOF
            {
             before(grammarAccess.getEdgeDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeDevice();

            state._fsp--;

             after(grammarAccess.getEdgeDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeDevice"


    // $ANTLR start "ruleEdgeDevice"
    // InternalIoTECS.g:237:1: ruleEdgeDevice : ( ( rule__EdgeDevice__Group__0 ) ) ;
    public final void ruleEdgeDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:241:2: ( ( ( rule__EdgeDevice__Group__0 ) ) )
            // InternalIoTECS.g:242:2: ( ( rule__EdgeDevice__Group__0 ) )
            {
            // InternalIoTECS.g:242:2: ( ( rule__EdgeDevice__Group__0 ) )
            // InternalIoTECS.g:243:3: ( rule__EdgeDevice__Group__0 )
            {
             before(grammarAccess.getEdgeDeviceAccess().getGroup()); 
            // InternalIoTECS.g:244:3: ( rule__EdgeDevice__Group__0 )
            // InternalIoTECS.g:244:4: rule__EdgeDevice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeDevice"


    // $ANTLR start "entryRuleSpeed"
    // InternalIoTECS.g:253:1: entryRuleSpeed : ruleSpeed EOF ;
    public final void entryRuleSpeed() throws RecognitionException {
        try {
            // InternalIoTECS.g:254:1: ( ruleSpeed EOF )
            // InternalIoTECS.g:255:1: ruleSpeed EOF
            {
             before(grammarAccess.getSpeedRule()); 
            pushFollow(FOLLOW_1);
            ruleSpeed();

            state._fsp--;

             after(grammarAccess.getSpeedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpeed"


    // $ANTLR start "ruleSpeed"
    // InternalIoTECS.g:262:1: ruleSpeed : ( ( rule__Speed__Alternatives ) ) ;
    public final void ruleSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:266:2: ( ( ( rule__Speed__Alternatives ) ) )
            // InternalIoTECS.g:267:2: ( ( rule__Speed__Alternatives ) )
            {
            // InternalIoTECS.g:267:2: ( ( rule__Speed__Alternatives ) )
            // InternalIoTECS.g:268:3: ( rule__Speed__Alternatives )
            {
             before(grammarAccess.getSpeedAccess().getAlternatives()); 
            // InternalIoTECS.g:269:3: ( rule__Speed__Alternatives )
            // InternalIoTECS.g:269:4: rule__Speed__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Speed__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpeedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "entryRuleEdgeDevices"
    // InternalIoTECS.g:278:1: entryRuleEdgeDevices : ruleEdgeDevices EOF ;
    public final void entryRuleEdgeDevices() throws RecognitionException {
        try {
            // InternalIoTECS.g:279:1: ( ruleEdgeDevices EOF )
            // InternalIoTECS.g:280:1: ruleEdgeDevices EOF
            {
             before(grammarAccess.getEdgeDevicesRule()); 
            pushFollow(FOLLOW_1);
            ruleEdgeDevices();

            state._fsp--;

             after(grammarAccess.getEdgeDevicesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeDevices"


    // $ANTLR start "ruleEdgeDevices"
    // InternalIoTECS.g:287:1: ruleEdgeDevices : ( ( rule__EdgeDevices__Group__0 ) ) ;
    public final void ruleEdgeDevices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:291:2: ( ( ( rule__EdgeDevices__Group__0 ) ) )
            // InternalIoTECS.g:292:2: ( ( rule__EdgeDevices__Group__0 ) )
            {
            // InternalIoTECS.g:292:2: ( ( rule__EdgeDevices__Group__0 ) )
            // InternalIoTECS.g:293:3: ( rule__EdgeDevices__Group__0 )
            {
             before(grammarAccess.getEdgeDevicesAccess().getGroup()); 
            // InternalIoTECS.g:294:3: ( rule__EdgeDevices__Group__0 )
            // InternalIoTECS.g:294:4: rule__EdgeDevices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDevicesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeDevices"


    // $ANTLR start "entryRuleDevices"
    // InternalIoTECS.g:303:1: entryRuleDevices : ruleDevices EOF ;
    public final void entryRuleDevices() throws RecognitionException {
        try {
            // InternalIoTECS.g:304:1: ( ruleDevices EOF )
            // InternalIoTECS.g:305:1: ruleDevices EOF
            {
             before(grammarAccess.getDevicesRule()); 
            pushFollow(FOLLOW_1);
            ruleDevices();

            state._fsp--;

             after(grammarAccess.getDevicesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevices"


    // $ANTLR start "ruleDevices"
    // InternalIoTECS.g:312:1: ruleDevices : ( ( rule__Devices__Group__0 ) ) ;
    public final void ruleDevices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:316:2: ( ( ( rule__Devices__Group__0 ) ) )
            // InternalIoTECS.g:317:2: ( ( rule__Devices__Group__0 ) )
            {
            // InternalIoTECS.g:317:2: ( ( rule__Devices__Group__0 ) )
            // InternalIoTECS.g:318:3: ( rule__Devices__Group__0 )
            {
             before(grammarAccess.getDevicesAccess().getGroup()); 
            // InternalIoTECS.g:319:3: ( rule__Devices__Group__0 )
            // InternalIoTECS.g:319:4: rule__Devices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Devices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDevicesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevices"


    // $ANTLR start "entryRuleDevice"
    // InternalIoTECS.g:328:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalIoTECS.g:329:1: ( ruleDevice EOF )
            // InternalIoTECS.g:330:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIoTECS.g:337:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:341:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalIoTECS.g:342:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalIoTECS.g:342:2: ( ( rule__Device__Group__0 ) )
            // InternalIoTECS.g:343:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalIoTECS.g:344:3: ( rule__Device__Group__0 )
            // InternalIoTECS.g:344:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleIP"
    // InternalIoTECS.g:353:1: entryRuleIP : ruleIP EOF ;
    public final void entryRuleIP() throws RecognitionException {
        try {
            // InternalIoTECS.g:354:1: ( ruleIP EOF )
            // InternalIoTECS.g:355:1: ruleIP EOF
            {
             before(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_1);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getIPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // InternalIoTECS.g:362:1: ruleIP : ( ( rule__IP__Group__0 ) ) ;
    public final void ruleIP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:366:2: ( ( ( rule__IP__Group__0 ) ) )
            // InternalIoTECS.g:367:2: ( ( rule__IP__Group__0 ) )
            {
            // InternalIoTECS.g:367:2: ( ( rule__IP__Group__0 ) )
            // InternalIoTECS.g:368:3: ( rule__IP__Group__0 )
            {
             before(grammarAccess.getIPAccess().getGroup()); 
            // InternalIoTECS.g:369:3: ( rule__IP__Group__0 )
            // InternalIoTECS.g:369:4: rule__IP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIP"


    // $ANTLR start "ruleTimeUnit"
    // InternalIoTECS.g:378:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:382:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalIoTECS.g:383:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalIoTECS.g:383:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalIoTECS.g:384:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalIoTECS.g:385:3: ( rule__TimeUnit__Alternatives )
            // InternalIoTECS.g:385:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleTimeUnitForWorkload"
    // InternalIoTECS.g:394:1: ruleTimeUnitForWorkload : ( ( rule__TimeUnitForWorkload__Alternatives ) ) ;
    public final void ruleTimeUnitForWorkload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:398:1: ( ( ( rule__TimeUnitForWorkload__Alternatives ) ) )
            // InternalIoTECS.g:399:2: ( ( rule__TimeUnitForWorkload__Alternatives ) )
            {
            // InternalIoTECS.g:399:2: ( ( rule__TimeUnitForWorkload__Alternatives ) )
            // InternalIoTECS.g:400:3: ( rule__TimeUnitForWorkload__Alternatives )
            {
             before(grammarAccess.getTimeUnitForWorkloadAccess().getAlternatives()); 
            // InternalIoTECS.g:401:3: ( rule__TimeUnitForWorkload__Alternatives )
            // InternalIoTECS.g:401:4: rule__TimeUnitForWorkload__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnitForWorkload__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitForWorkloadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnitForWorkload"


    // $ANTLR start "rulePayloadUnit"
    // InternalIoTECS.g:410:1: rulePayloadUnit : ( ( rule__PayloadUnit__Alternatives ) ) ;
    public final void rulePayloadUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:414:1: ( ( ( rule__PayloadUnit__Alternatives ) ) )
            // InternalIoTECS.g:415:2: ( ( rule__PayloadUnit__Alternatives ) )
            {
            // InternalIoTECS.g:415:2: ( ( rule__PayloadUnit__Alternatives ) )
            // InternalIoTECS.g:416:3: ( rule__PayloadUnit__Alternatives )
            {
             before(grammarAccess.getPayloadUnitAccess().getAlternatives()); 
            // InternalIoTECS.g:417:3: ( rule__PayloadUnit__Alternatives )
            // InternalIoTECS.g:417:4: rule__PayloadUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PayloadUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPayloadUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePayloadUnit"


    // $ANTLR start "ruleProtocol"
    // InternalIoTECS.g:426:1: ruleProtocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:430:1: ( ( ( rule__Protocol__Alternatives ) ) )
            // InternalIoTECS.g:431:2: ( ( rule__Protocol__Alternatives ) )
            {
            // InternalIoTECS.g:431:2: ( ( rule__Protocol__Alternatives ) )
            // InternalIoTECS.g:432:3: ( rule__Protocol__Alternatives )
            {
             before(grammarAccess.getProtocolAccess().getAlternatives()); 
            // InternalIoTECS.g:433:3: ( rule__Protocol__Alternatives )
            // InternalIoTECS.g:433:4: rule__Protocol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "rulePlatformType"
    // InternalIoTECS.g:442:1: rulePlatformType : ( ( rule__PlatformType__Alternatives ) ) ;
    public final void rulePlatformType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:446:1: ( ( ( rule__PlatformType__Alternatives ) ) )
            // InternalIoTECS.g:447:2: ( ( rule__PlatformType__Alternatives ) )
            {
            // InternalIoTECS.g:447:2: ( ( rule__PlatformType__Alternatives ) )
            // InternalIoTECS.g:448:3: ( rule__PlatformType__Alternatives )
            {
             before(grammarAccess.getPlatformTypeAccess().getAlternatives()); 
            // InternalIoTECS.g:449:3: ( rule__PlatformType__Alternatives )
            // InternalIoTECS.g:449:4: rule__PlatformType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlatformType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlatformTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatformType"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalIoTECS.g:457:1: rule__Element__Alternatives : ( ( ruleSimulator ) | ( rulePlatform ) | ( ruleSimulationNode ) | ( ruleEdgeDevice ) | ( ruleDevice ) | ( ruleCloud ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:461:1: ( ( ruleSimulator ) | ( rulePlatform ) | ( ruleSimulationNode ) | ( ruleEdgeDevice ) | ( ruleDevice ) | ( ruleCloud ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 47:
                {
                alt2=3;
                }
                break;
            case 53:
                {
                alt2=4;
                }
                break;
            case 58:
                {
                alt2=5;
                }
                break;
            case 42:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIoTECS.g:462:2: ( ruleSimulator )
                    {
                    // InternalIoTECS.g:462:2: ( ruleSimulator )
                    // InternalIoTECS.g:463:3: ruleSimulator
                    {
                     before(grammarAccess.getElementAccess().getSimulatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimulator();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSimulatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTECS.g:468:2: ( rulePlatform )
                    {
                    // InternalIoTECS.g:468:2: ( rulePlatform )
                    // InternalIoTECS.g:469:3: rulePlatform
                    {
                     before(grammarAccess.getElementAccess().getPlatformParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePlatform();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPlatformParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTECS.g:474:2: ( ruleSimulationNode )
                    {
                    // InternalIoTECS.g:474:2: ( ruleSimulationNode )
                    // InternalIoTECS.g:475:3: ruleSimulationNode
                    {
                     before(grammarAccess.getElementAccess().getSimulationNodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSimulationNode();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSimulationNodeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTECS.g:480:2: ( ruleEdgeDevice )
                    {
                    // InternalIoTECS.g:480:2: ( ruleEdgeDevice )
                    // InternalIoTECS.g:481:3: ruleEdgeDevice
                    {
                     before(grammarAccess.getElementAccess().getEdgeDeviceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEdgeDevice();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEdgeDeviceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIoTECS.g:486:2: ( ruleDevice )
                    {
                    // InternalIoTECS.g:486:2: ( ruleDevice )
                    // InternalIoTECS.g:487:3: ruleDevice
                    {
                     before(grammarAccess.getElementAccess().getDeviceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDevice();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDeviceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIoTECS.g:492:2: ( ruleCloud )
                    {
                    // InternalIoTECS.g:492:2: ( ruleCloud )
                    // InternalIoTECS.g:493:3: ruleCloud
                    {
                     before(grammarAccess.getElementAccess().getCloudParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCloud();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCloudParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Speed__Alternatives"
    // InternalIoTECS.g:502:1: rule__Speed__Alternatives : ( ( 'Max' ) | ( RULE_INT ) );
    public final void rule__Speed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:506:1: ( ( 'Max' ) | ( RULE_INT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoTECS.g:507:2: ( 'Max' )
                    {
                    // InternalIoTECS.g:507:2: ( 'Max' )
                    // InternalIoTECS.g:508:3: 'Max'
                    {
                     before(grammarAccess.getSpeedAccess().getMaxKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSpeedAccess().getMaxKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTECS.g:513:2: ( RULE_INT )
                    {
                    // InternalIoTECS.g:513:2: ( RULE_INT )
                    // InternalIoTECS.g:514:3: RULE_INT
                    {
                     before(grammarAccess.getSpeedAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSpeedAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Speed__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalIoTECS.g:523:1: rule__TimeUnit__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) | ( ( 'h' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:527:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) | ( ( 'h' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalIoTECS.g:528:2: ( ( 'ms' ) )
                    {
                    // InternalIoTECS.g:528:2: ( ( 'ms' ) )
                    // InternalIoTECS.g:529:3: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_0()); 
                    // InternalIoTECS.g:530:3: ( 'ms' )
                    // InternalIoTECS.g:530:4: 'ms'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMillisecondEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTECS.g:534:2: ( ( 's' ) )
                    {
                    // InternalIoTECS.g:534:2: ( ( 's' ) )
                    // InternalIoTECS.g:535:3: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_1()); 
                    // InternalIoTECS.g:536:3: ( 's' )
                    // InternalIoTECS.g:536:4: 's'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSecondEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTECS.g:540:2: ( ( 'm' ) )
                    {
                    // InternalIoTECS.g:540:2: ( ( 'm' ) )
                    // InternalIoTECS.g:541:3: ( 'm' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMinuteEnumLiteralDeclaration_2()); 
                    // InternalIoTECS.g:542:3: ( 'm' )
                    // InternalIoTECS.g:542:4: 'm'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMinuteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTECS.g:546:2: ( ( 'h' ) )
                    {
                    // InternalIoTECS.g:546:2: ( ( 'h' ) )
                    // InternalIoTECS.g:547:3: ( 'h' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_3()); 
                    // InternalIoTECS.g:548:3: ( 'h' )
                    // InternalIoTECS.g:548:4: 'h'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__TimeUnitForWorkload__Alternatives"
    // InternalIoTECS.g:556:1: rule__TimeUnitForWorkload__Alternatives : ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) );
    public final void rule__TimeUnitForWorkload__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:560:1: ( ( ( 'ms' ) ) | ( ( 's' ) ) | ( ( 'm' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalIoTECS.g:561:2: ( ( 'ms' ) )
                    {
                    // InternalIoTECS.g:561:2: ( ( 'ms' ) )
                    // InternalIoTECS.g:562:3: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitForWorkloadAccess().getMillisecondEnumLiteralDeclaration_0()); 
                    // InternalIoTECS.g:563:3: ( 'ms' )
                    // InternalIoTECS.g:563:4: 'ms'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitForWorkloadAccess().getMillisecondEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTECS.g:567:2: ( ( 's' ) )
                    {
                    // InternalIoTECS.g:567:2: ( ( 's' ) )
                    // InternalIoTECS.g:568:3: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitForWorkloadAccess().getSecondEnumLiteralDeclaration_1()); 
                    // InternalIoTECS.g:569:3: ( 's' )
                    // InternalIoTECS.g:569:4: 's'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitForWorkloadAccess().getSecondEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTECS.g:573:2: ( ( 'm' ) )
                    {
                    // InternalIoTECS.g:573:2: ( ( 'm' ) )
                    // InternalIoTECS.g:574:3: ( 'm' )
                    {
                     before(grammarAccess.getTimeUnitForWorkloadAccess().getMinuteEnumLiteralDeclaration_2()); 
                    // InternalIoTECS.g:575:3: ( 'm' )
                    // InternalIoTECS.g:575:4: 'm'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitForWorkloadAccess().getMinuteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnitForWorkload__Alternatives"


    // $ANTLR start "rule__PayloadUnit__Alternatives"
    // InternalIoTECS.g:583:1: rule__PayloadUnit__Alternatives : ( ( ( 'b' ) ) | ( ( 'Mb' ) ) | ( ( 'Kb' ) ) );
    public final void rule__PayloadUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:587:1: ( ( ( 'b' ) ) | ( ( 'Mb' ) ) | ( ( 'Kb' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIoTECS.g:588:2: ( ( 'b' ) )
                    {
                    // InternalIoTECS.g:588:2: ( ( 'b' ) )
                    // InternalIoTECS.g:589:3: ( 'b' )
                    {
                     before(grammarAccess.getPayloadUnitAccess().getByteEnumLiteralDeclaration_0()); 
                    // InternalIoTECS.g:590:3: ( 'b' )
                    // InternalIoTECS.g:590:4: 'b'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayloadUnitAccess().getByteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTECS.g:594:2: ( ( 'Mb' ) )
                    {
                    // InternalIoTECS.g:594:2: ( ( 'Mb' ) )
                    // InternalIoTECS.g:595:3: ( 'Mb' )
                    {
                     before(grammarAccess.getPayloadUnitAccess().getMbEnumLiteralDeclaration_1()); 
                    // InternalIoTECS.g:596:3: ( 'Mb' )
                    // InternalIoTECS.g:596:4: 'Mb'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayloadUnitAccess().getMbEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTECS.g:600:2: ( ( 'Kb' ) )
                    {
                    // InternalIoTECS.g:600:2: ( ( 'Kb' ) )
                    // InternalIoTECS.g:601:3: ( 'Kb' )
                    {
                     before(grammarAccess.getPayloadUnitAccess().getKbEnumLiteralDeclaration_2()); 
                    // InternalIoTECS.g:602:3: ( 'Kb' )
                    // InternalIoTECS.g:602:4: 'Kb'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPayloadUnitAccess().getKbEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PayloadUnit__Alternatives"


    // $ANTLR start "rule__Protocol__Alternatives"
    // InternalIoTECS.g:610:1: rule__Protocol__Alternatives : ( ( ( 'UDP' ) ) | ( ( 'TCP' ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:614:1: ( ( ( 'UDP' ) ) | ( ( 'TCP' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTECS.g:615:2: ( ( 'UDP' ) )
                    {
                    // InternalIoTECS.g:615:2: ( ( 'UDP' ) )
                    // InternalIoTECS.g:616:3: ( 'UDP' )
                    {
                     before(grammarAccess.getProtocolAccess().getUdpEnumLiteralDeclaration_0()); 
                    // InternalIoTECS.g:617:3: ( 'UDP' )
                    // InternalIoTECS.g:617:4: 'UDP'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocolAccess().getUdpEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTECS.g:621:2: ( ( 'TCP' ) )
                    {
                    // InternalIoTECS.g:621:2: ( ( 'TCP' ) )
                    // InternalIoTECS.g:622:3: ( 'TCP' )
                    {
                     before(grammarAccess.getProtocolAccess().getTcpEnumLiteralDeclaration_1()); 
                    // InternalIoTECS.g:623:3: ( 'TCP' )
                    // InternalIoTECS.g:623:4: 'TCP'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocolAccess().getTcpEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Alternatives"


    // $ANTLR start "rule__PlatformType__Alternatives"
    // InternalIoTECS.g:631:1: rule__PlatformType__Alternatives : ( ( ( 'Docker' ) ) | ( ( 'VM' ) ) | ( ( 'Native' ) ) );
    public final void rule__PlatformType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:635:1: ( ( ( 'Docker' ) ) | ( ( 'VM' ) ) | ( ( 'Native' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIoTECS.g:636:2: ( ( 'Docker' ) )
                    {
                    // InternalIoTECS.g:636:2: ( ( 'Docker' ) )
                    // InternalIoTECS.g:637:3: ( 'Docker' )
                    {
                     before(grammarAccess.getPlatformTypeAccess().getDockerEnumLiteralDeclaration_0()); 
                    // InternalIoTECS.g:638:3: ( 'Docker' )
                    // InternalIoTECS.g:638:4: 'Docker'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlatformTypeAccess().getDockerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTECS.g:642:2: ( ( 'VM' ) )
                    {
                    // InternalIoTECS.g:642:2: ( ( 'VM' ) )
                    // InternalIoTECS.g:643:3: ( 'VM' )
                    {
                     before(grammarAccess.getPlatformTypeAccess().getVmEnumLiteralDeclaration_1()); 
                    // InternalIoTECS.g:644:3: ( 'VM' )
                    // InternalIoTECS.g:644:4: 'VM'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlatformTypeAccess().getVmEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTECS.g:648:2: ( ( 'Native' ) )
                    {
                    // InternalIoTECS.g:648:2: ( ( 'Native' ) )
                    // InternalIoTECS.g:649:3: ( 'Native' )
                    {
                     before(grammarAccess.getPlatformTypeAccess().getNativeEnumLiteralDeclaration_2()); 
                    // InternalIoTECS.g:650:3: ( 'Native' )
                    // InternalIoTECS.g:650:4: 'Native'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlatformTypeAccess().getNativeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformType__Alternatives"


    // $ANTLR start "rule__Platform__Group__0"
    // InternalIoTECS.g:658:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:662:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // InternalIoTECS.g:663:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__0"


    // $ANTLR start "rule__Platform__Group__0__Impl"
    // InternalIoTECS.g:670:1: rule__Platform__Group__0__Impl : ( 'Platform:' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:674:1: ( ( 'Platform:' ) )
            // InternalIoTECS.g:675:1: ( 'Platform:' )
            {
            // InternalIoTECS.g:675:1: ( 'Platform:' )
            // InternalIoTECS.g:676:2: 'Platform:'
            {
             before(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getPlatformKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__0__Impl"


    // $ANTLR start "rule__Platform__Group__1"
    // InternalIoTECS.g:685:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:689:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // InternalIoTECS.g:690:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__1"


    // $ANTLR start "rule__Platform__Group__1__Impl"
    // InternalIoTECS.g:697:1: rule__Platform__Group__1__Impl : ( ( rule__Platform__NameAssignment_1 ) ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:701:1: ( ( ( rule__Platform__NameAssignment_1 ) ) )
            // InternalIoTECS.g:702:1: ( ( rule__Platform__NameAssignment_1 ) )
            {
            // InternalIoTECS.g:702:1: ( ( rule__Platform__NameAssignment_1 ) )
            // InternalIoTECS.g:703:2: ( rule__Platform__NameAssignment_1 )
            {
             before(grammarAccess.getPlatformAccess().getNameAssignment_1()); 
            // InternalIoTECS.g:704:2: ( rule__Platform__NameAssignment_1 )
            // InternalIoTECS.g:704:3: rule__Platform__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Platform__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__2"
    // InternalIoTECS.g:712:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:716:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // InternalIoTECS.g:717:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__2"


    // $ANTLR start "rule__Platform__Group__2__Impl"
    // InternalIoTECS.g:724:1: rule__Platform__Group__2__Impl : ( '{' ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:728:1: ( ( '{' ) )
            // InternalIoTECS.g:729:1: ( '{' )
            {
            // InternalIoTECS.g:729:1: ( '{' )
            // InternalIoTECS.g:730:2: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__2__Impl"


    // $ANTLR start "rule__Platform__Group__3"
    // InternalIoTECS.g:739:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl rule__Platform__Group__4 ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:743:1: ( rule__Platform__Group__3__Impl rule__Platform__Group__4 )
            // InternalIoTECS.g:744:2: rule__Platform__Group__3__Impl rule__Platform__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__3"


    // $ANTLR start "rule__Platform__Group__3__Impl"
    // InternalIoTECS.g:751:1: rule__Platform__Group__3__Impl : ( 'type:' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:755:1: ( ( 'type:' ) )
            // InternalIoTECS.g:756:1: ( 'type:' )
            {
            // InternalIoTECS.g:756:1: ( 'type:' )
            // InternalIoTECS.g:757:2: 'type:'
            {
             before(grammarAccess.getPlatformAccess().getTypeKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__3__Impl"


    // $ANTLR start "rule__Platform__Group__4"
    // InternalIoTECS.g:766:1: rule__Platform__Group__4 : rule__Platform__Group__4__Impl rule__Platform__Group__5 ;
    public final void rule__Platform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:770:1: ( rule__Platform__Group__4__Impl rule__Platform__Group__5 )
            // InternalIoTECS.g:771:2: rule__Platform__Group__4__Impl rule__Platform__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Platform__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__4"


    // $ANTLR start "rule__Platform__Group__4__Impl"
    // InternalIoTECS.g:778:1: rule__Platform__Group__4__Impl : ( ( rule__Platform__TypeAssignment_4 ) ) ;
    public final void rule__Platform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:782:1: ( ( ( rule__Platform__TypeAssignment_4 ) ) )
            // InternalIoTECS.g:783:1: ( ( rule__Platform__TypeAssignment_4 ) )
            {
            // InternalIoTECS.g:783:1: ( ( rule__Platform__TypeAssignment_4 ) )
            // InternalIoTECS.g:784:2: ( rule__Platform__TypeAssignment_4 )
            {
             before(grammarAccess.getPlatformAccess().getTypeAssignment_4()); 
            // InternalIoTECS.g:785:2: ( rule__Platform__TypeAssignment_4 )
            // InternalIoTECS.g:785:3: rule__Platform__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Platform__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__4__Impl"


    // $ANTLR start "rule__Platform__Group__5"
    // InternalIoTECS.g:793:1: rule__Platform__Group__5 : rule__Platform__Group__5__Impl rule__Platform__Group__6 ;
    public final void rule__Platform__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:797:1: ( rule__Platform__Group__5__Impl rule__Platform__Group__6 )
            // InternalIoTECS.g:798:2: rule__Platform__Group__5__Impl rule__Platform__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Platform__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__5"


    // $ANTLR start "rule__Platform__Group__5__Impl"
    // InternalIoTECS.g:805:1: rule__Platform__Group__5__Impl : ( 'networkAdapter:' ) ;
    public final void rule__Platform__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:809:1: ( ( 'networkAdapter:' ) )
            // InternalIoTECS.g:810:1: ( 'networkAdapter:' )
            {
            // InternalIoTECS.g:810:1: ( 'networkAdapter:' )
            // InternalIoTECS.g:811:2: 'networkAdapter:'
            {
             before(grammarAccess.getPlatformAccess().getNetworkAdapterKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getNetworkAdapterKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__5__Impl"


    // $ANTLR start "rule__Platform__Group__6"
    // InternalIoTECS.g:820:1: rule__Platform__Group__6 : rule__Platform__Group__6__Impl rule__Platform__Group__7 ;
    public final void rule__Platform__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:824:1: ( rule__Platform__Group__6__Impl rule__Platform__Group__7 )
            // InternalIoTECS.g:825:2: rule__Platform__Group__6__Impl rule__Platform__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Platform__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__6"


    // $ANTLR start "rule__Platform__Group__6__Impl"
    // InternalIoTECS.g:832:1: rule__Platform__Group__6__Impl : ( ( rule__Platform__NetworkAdapterAssignment_6 ) ) ;
    public final void rule__Platform__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:836:1: ( ( ( rule__Platform__NetworkAdapterAssignment_6 ) ) )
            // InternalIoTECS.g:837:1: ( ( rule__Platform__NetworkAdapterAssignment_6 ) )
            {
            // InternalIoTECS.g:837:1: ( ( rule__Platform__NetworkAdapterAssignment_6 ) )
            // InternalIoTECS.g:838:2: ( rule__Platform__NetworkAdapterAssignment_6 )
            {
             before(grammarAccess.getPlatformAccess().getNetworkAdapterAssignment_6()); 
            // InternalIoTECS.g:839:2: ( rule__Platform__NetworkAdapterAssignment_6 )
            // InternalIoTECS.g:839:3: rule__Platform__NetworkAdapterAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Platform__NetworkAdapterAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getNetworkAdapterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__6__Impl"


    // $ANTLR start "rule__Platform__Group__7"
    // InternalIoTECS.g:847:1: rule__Platform__Group__7 : rule__Platform__Group__7__Impl rule__Platform__Group__8 ;
    public final void rule__Platform__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:851:1: ( rule__Platform__Group__7__Impl rule__Platform__Group__8 )
            // InternalIoTECS.g:852:2: rule__Platform__Group__7__Impl rule__Platform__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Platform__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__7"


    // $ANTLR start "rule__Platform__Group__7__Impl"
    // InternalIoTECS.g:859:1: rule__Platform__Group__7__Impl : ( ( rule__Platform__Group_7__0 )? ) ;
    public final void rule__Platform__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:863:1: ( ( ( rule__Platform__Group_7__0 )? ) )
            // InternalIoTECS.g:864:1: ( ( rule__Platform__Group_7__0 )? )
            {
            // InternalIoTECS.g:864:1: ( ( rule__Platform__Group_7__0 )? )
            // InternalIoTECS.g:865:2: ( rule__Platform__Group_7__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_7()); 
            // InternalIoTECS.g:866:2: ( rule__Platform__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTECS.g:866:3: rule__Platform__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platform__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__7__Impl"


    // $ANTLR start "rule__Platform__Group__8"
    // InternalIoTECS.g:874:1: rule__Platform__Group__8 : rule__Platform__Group__8__Impl rule__Platform__Group__9 ;
    public final void rule__Platform__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:878:1: ( rule__Platform__Group__8__Impl rule__Platform__Group__9 )
            // InternalIoTECS.g:879:2: rule__Platform__Group__8__Impl rule__Platform__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Platform__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__8"


    // $ANTLR start "rule__Platform__Group__8__Impl"
    // InternalIoTECS.g:886:1: rule__Platform__Group__8__Impl : ( ( rule__Platform__Group_8__0 )? ) ;
    public final void rule__Platform__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:890:1: ( ( ( rule__Platform__Group_8__0 )? ) )
            // InternalIoTECS.g:891:1: ( ( rule__Platform__Group_8__0 )? )
            {
            // InternalIoTECS.g:891:1: ( ( rule__Platform__Group_8__0 )? )
            // InternalIoTECS.g:892:2: ( rule__Platform__Group_8__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_8()); 
            // InternalIoTECS.g:893:2: ( rule__Platform__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTECS.g:893:3: rule__Platform__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platform__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__8__Impl"


    // $ANTLR start "rule__Platform__Group__9"
    // InternalIoTECS.g:901:1: rule__Platform__Group__9 : rule__Platform__Group__9__Impl rule__Platform__Group__10 ;
    public final void rule__Platform__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:905:1: ( rule__Platform__Group__9__Impl rule__Platform__Group__10 )
            // InternalIoTECS.g:906:2: rule__Platform__Group__9__Impl rule__Platform__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Platform__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__9"


    // $ANTLR start "rule__Platform__Group__9__Impl"
    // InternalIoTECS.g:913:1: rule__Platform__Group__9__Impl : ( ( rule__Platform__Group_9__0 )? ) ;
    public final void rule__Platform__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:917:1: ( ( ( rule__Platform__Group_9__0 )? ) )
            // InternalIoTECS.g:918:1: ( ( rule__Platform__Group_9__0 )? )
            {
            // InternalIoTECS.g:918:1: ( ( rule__Platform__Group_9__0 )? )
            // InternalIoTECS.g:919:2: ( rule__Platform__Group_9__0 )?
            {
             before(grammarAccess.getPlatformAccess().getGroup_9()); 
            // InternalIoTECS.g:920:2: ( rule__Platform__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoTECS.g:920:3: rule__Platform__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platform__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__9__Impl"


    // $ANTLR start "rule__Platform__Group__10"
    // InternalIoTECS.g:928:1: rule__Platform__Group__10 : rule__Platform__Group__10__Impl ;
    public final void rule__Platform__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:932:1: ( rule__Platform__Group__10__Impl )
            // InternalIoTECS.g:933:2: rule__Platform__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__10"


    // $ANTLR start "rule__Platform__Group__10__Impl"
    // InternalIoTECS.g:939:1: rule__Platform__Group__10__Impl : ( '}' ) ;
    public final void rule__Platform__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:943:1: ( ( '}' ) )
            // InternalIoTECS.g:944:1: ( '}' )
            {
            // InternalIoTECS.g:944:1: ( '}' )
            // InternalIoTECS.g:945:2: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group__10__Impl"


    // $ANTLR start "rule__Platform__Group_7__0"
    // InternalIoTECS.g:955:1: rule__Platform__Group_7__0 : rule__Platform__Group_7__0__Impl rule__Platform__Group_7__1 ;
    public final void rule__Platform__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:959:1: ( rule__Platform__Group_7__0__Impl rule__Platform__Group_7__1 )
            // InternalIoTECS.g:960:2: rule__Platform__Group_7__0__Impl rule__Platform__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Platform__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__0"


    // $ANTLR start "rule__Platform__Group_7__0__Impl"
    // InternalIoTECS.g:967:1: rule__Platform__Group_7__0__Impl : ( 'locationIP:' ) ;
    public final void rule__Platform__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:971:1: ( ( 'locationIP:' ) )
            // InternalIoTECS.g:972:1: ( 'locationIP:' )
            {
            // InternalIoTECS.g:972:1: ( 'locationIP:' )
            // InternalIoTECS.g:973:2: 'locationIP:'
            {
             before(grammarAccess.getPlatformAccess().getLocationIPKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLocationIPKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__0__Impl"


    // $ANTLR start "rule__Platform__Group_7__1"
    // InternalIoTECS.g:982:1: rule__Platform__Group_7__1 : rule__Platform__Group_7__1__Impl rule__Platform__Group_7__2 ;
    public final void rule__Platform__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:986:1: ( rule__Platform__Group_7__1__Impl rule__Platform__Group_7__2 )
            // InternalIoTECS.g:987:2: rule__Platform__Group_7__1__Impl rule__Platform__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Platform__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__1"


    // $ANTLR start "rule__Platform__Group_7__1__Impl"
    // InternalIoTECS.g:994:1: rule__Platform__Group_7__1__Impl : ( ( rule__Platform__LocationAssignment_7_1 ) ) ;
    public final void rule__Platform__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:998:1: ( ( ( rule__Platform__LocationAssignment_7_1 ) ) )
            // InternalIoTECS.g:999:1: ( ( rule__Platform__LocationAssignment_7_1 ) )
            {
            // InternalIoTECS.g:999:1: ( ( rule__Platform__LocationAssignment_7_1 ) )
            // InternalIoTECS.g:1000:2: ( rule__Platform__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPlatformAccess().getLocationAssignment_7_1()); 
            // InternalIoTECS.g:1001:2: ( rule__Platform__LocationAssignment_7_1 )
            // InternalIoTECS.g:1001:3: rule__Platform__LocationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Platform__LocationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getLocationAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__1__Impl"


    // $ANTLR start "rule__Platform__Group_7__2"
    // InternalIoTECS.g:1009:1: rule__Platform__Group_7__2 : rule__Platform__Group_7__2__Impl rule__Platform__Group_7__3 ;
    public final void rule__Platform__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1013:1: ( rule__Platform__Group_7__2__Impl rule__Platform__Group_7__3 )
            // InternalIoTECS.g:1014:2: rule__Platform__Group_7__2__Impl rule__Platform__Group_7__3
            {
            pushFollow(FOLLOW_4);
            rule__Platform__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__2"


    // $ANTLR start "rule__Platform__Group_7__2__Impl"
    // InternalIoTECS.g:1021:1: rule__Platform__Group_7__2__Impl : ( 'userName:' ) ;
    public final void rule__Platform__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1025:1: ( ( 'userName:' ) )
            // InternalIoTECS.g:1026:1: ( 'userName:' )
            {
            // InternalIoTECS.g:1026:1: ( 'userName:' )
            // InternalIoTECS.g:1027:2: 'userName:'
            {
             before(grammarAccess.getPlatformAccess().getUserNameKeyword_7_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getUserNameKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__2__Impl"


    // $ANTLR start "rule__Platform__Group_7__3"
    // InternalIoTECS.g:1036:1: rule__Platform__Group_7__3 : rule__Platform__Group_7__3__Impl rule__Platform__Group_7__4 ;
    public final void rule__Platform__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1040:1: ( rule__Platform__Group_7__3__Impl rule__Platform__Group_7__4 )
            // InternalIoTECS.g:1041:2: rule__Platform__Group_7__3__Impl rule__Platform__Group_7__4
            {
            pushFollow(FOLLOW_13);
            rule__Platform__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__3"


    // $ANTLR start "rule__Platform__Group_7__3__Impl"
    // InternalIoTECS.g:1048:1: rule__Platform__Group_7__3__Impl : ( ( rule__Platform__UserAssignment_7_3 ) ) ;
    public final void rule__Platform__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1052:1: ( ( ( rule__Platform__UserAssignment_7_3 ) ) )
            // InternalIoTECS.g:1053:1: ( ( rule__Platform__UserAssignment_7_3 ) )
            {
            // InternalIoTECS.g:1053:1: ( ( rule__Platform__UserAssignment_7_3 ) )
            // InternalIoTECS.g:1054:2: ( rule__Platform__UserAssignment_7_3 )
            {
             before(grammarAccess.getPlatformAccess().getUserAssignment_7_3()); 
            // InternalIoTECS.g:1055:2: ( rule__Platform__UserAssignment_7_3 )
            // InternalIoTECS.g:1055:3: rule__Platform__UserAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Platform__UserAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getUserAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__3__Impl"


    // $ANTLR start "rule__Platform__Group_7__4"
    // InternalIoTECS.g:1063:1: rule__Platform__Group_7__4 : rule__Platform__Group_7__4__Impl rule__Platform__Group_7__5 ;
    public final void rule__Platform__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1067:1: ( rule__Platform__Group_7__4__Impl rule__Platform__Group_7__5 )
            // InternalIoTECS.g:1068:2: rule__Platform__Group_7__4__Impl rule__Platform__Group_7__5
            {
            pushFollow(FOLLOW_9);
            rule__Platform__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__4"


    // $ANTLR start "rule__Platform__Group_7__4__Impl"
    // InternalIoTECS.g:1075:1: rule__Platform__Group_7__4__Impl : ( 'password:' ) ;
    public final void rule__Platform__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1079:1: ( ( 'password:' ) )
            // InternalIoTECS.g:1080:1: ( 'password:' )
            {
            // InternalIoTECS.g:1080:1: ( 'password:' )
            // InternalIoTECS.g:1081:2: 'password:'
            {
             before(grammarAccess.getPlatformAccess().getPasswordKeyword_7_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getPasswordKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__4__Impl"


    // $ANTLR start "rule__Platform__Group_7__5"
    // InternalIoTECS.g:1090:1: rule__Platform__Group_7__5 : rule__Platform__Group_7__5__Impl ;
    public final void rule__Platform__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1094:1: ( rule__Platform__Group_7__5__Impl )
            // InternalIoTECS.g:1095:2: rule__Platform__Group_7__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_7__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__5"


    // $ANTLR start "rule__Platform__Group_7__5__Impl"
    // InternalIoTECS.g:1101:1: rule__Platform__Group_7__5__Impl : ( ( rule__Platform__PasswordAssignment_7_5 ) ) ;
    public final void rule__Platform__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1105:1: ( ( ( rule__Platform__PasswordAssignment_7_5 ) ) )
            // InternalIoTECS.g:1106:1: ( ( rule__Platform__PasswordAssignment_7_5 ) )
            {
            // InternalIoTECS.g:1106:1: ( ( rule__Platform__PasswordAssignment_7_5 ) )
            // InternalIoTECS.g:1107:2: ( rule__Platform__PasswordAssignment_7_5 )
            {
             before(grammarAccess.getPlatformAccess().getPasswordAssignment_7_5()); 
            // InternalIoTECS.g:1108:2: ( rule__Platform__PasswordAssignment_7_5 )
            // InternalIoTECS.g:1108:3: rule__Platform__PasswordAssignment_7_5
            {
            pushFollow(FOLLOW_2);
            rule__Platform__PasswordAssignment_7_5();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getPasswordAssignment_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_7__5__Impl"


    // $ANTLR start "rule__Platform__Group_8__0"
    // InternalIoTECS.g:1117:1: rule__Platform__Group_8__0 : rule__Platform__Group_8__0__Impl rule__Platform__Group_8__1 ;
    public final void rule__Platform__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1121:1: ( rule__Platform__Group_8__0__Impl rule__Platform__Group_8__1 )
            // InternalIoTECS.g:1122:2: rule__Platform__Group_8__0__Impl rule__Platform__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__Platform__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__0"


    // $ANTLR start "rule__Platform__Group_8__0__Impl"
    // InternalIoTECS.g:1129:1: rule__Platform__Group_8__0__Impl : ( 'cpu:' ) ;
    public final void rule__Platform__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1133:1: ( ( 'cpu:' ) )
            // InternalIoTECS.g:1134:1: ( 'cpu:' )
            {
            // InternalIoTECS.g:1134:1: ( 'cpu:' )
            // InternalIoTECS.g:1135:2: 'cpu:'
            {
             before(grammarAccess.getPlatformAccess().getCpuKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getCpuKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__0__Impl"


    // $ANTLR start "rule__Platform__Group_8__1"
    // InternalIoTECS.g:1144:1: rule__Platform__Group_8__1 : rule__Platform__Group_8__1__Impl rule__Platform__Group_8__2 ;
    public final void rule__Platform__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1148:1: ( rule__Platform__Group_8__1__Impl rule__Platform__Group_8__2 )
            // InternalIoTECS.g:1149:2: rule__Platform__Group_8__1__Impl rule__Platform__Group_8__2
            {
            pushFollow(FOLLOW_14);
            rule__Platform__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__1"


    // $ANTLR start "rule__Platform__Group_8__1__Impl"
    // InternalIoTECS.g:1156:1: rule__Platform__Group_8__1__Impl : ( ( rule__Platform__CPUAssignment_8_1 ) ) ;
    public final void rule__Platform__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1160:1: ( ( ( rule__Platform__CPUAssignment_8_1 ) ) )
            // InternalIoTECS.g:1161:1: ( ( rule__Platform__CPUAssignment_8_1 ) )
            {
            // InternalIoTECS.g:1161:1: ( ( rule__Platform__CPUAssignment_8_1 ) )
            // InternalIoTECS.g:1162:2: ( rule__Platform__CPUAssignment_8_1 )
            {
             before(grammarAccess.getPlatformAccess().getCPUAssignment_8_1()); 
            // InternalIoTECS.g:1163:2: ( rule__Platform__CPUAssignment_8_1 )
            // InternalIoTECS.g:1163:3: rule__Platform__CPUAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Platform__CPUAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getCPUAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__1__Impl"


    // $ANTLR start "rule__Platform__Group_8__2"
    // InternalIoTECS.g:1171:1: rule__Platform__Group_8__2 : rule__Platform__Group_8__2__Impl rule__Platform__Group_8__3 ;
    public final void rule__Platform__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1175:1: ( rule__Platform__Group_8__2__Impl rule__Platform__Group_8__3 )
            // InternalIoTECS.g:1176:2: rule__Platform__Group_8__2__Impl rule__Platform__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__Platform__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__2"


    // $ANTLR start "rule__Platform__Group_8__2__Impl"
    // InternalIoTECS.g:1183:1: rule__Platform__Group_8__2__Impl : ( 'memory:' ) ;
    public final void rule__Platform__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1187:1: ( ( 'memory:' ) )
            // InternalIoTECS.g:1188:1: ( 'memory:' )
            {
            // InternalIoTECS.g:1188:1: ( 'memory:' )
            // InternalIoTECS.g:1189:2: 'memory:'
            {
             before(grammarAccess.getPlatformAccess().getMemoryKeyword_8_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getMemoryKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__2__Impl"


    // $ANTLR start "rule__Platform__Group_8__3"
    // InternalIoTECS.g:1198:1: rule__Platform__Group_8__3 : rule__Platform__Group_8__3__Impl rule__Platform__Group_8__4 ;
    public final void rule__Platform__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1202:1: ( rule__Platform__Group_8__3__Impl rule__Platform__Group_8__4 )
            // InternalIoTECS.g:1203:2: rule__Platform__Group_8__3__Impl rule__Platform__Group_8__4
            {
            pushFollow(FOLLOW_15);
            rule__Platform__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__3"


    // $ANTLR start "rule__Platform__Group_8__3__Impl"
    // InternalIoTECS.g:1210:1: rule__Platform__Group_8__3__Impl : ( ( rule__Platform__MemoryAssignment_8_3 ) ) ;
    public final void rule__Platform__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1214:1: ( ( ( rule__Platform__MemoryAssignment_8_3 ) ) )
            // InternalIoTECS.g:1215:1: ( ( rule__Platform__MemoryAssignment_8_3 ) )
            {
            // InternalIoTECS.g:1215:1: ( ( rule__Platform__MemoryAssignment_8_3 ) )
            // InternalIoTECS.g:1216:2: ( rule__Platform__MemoryAssignment_8_3 )
            {
             before(grammarAccess.getPlatformAccess().getMemoryAssignment_8_3()); 
            // InternalIoTECS.g:1217:2: ( rule__Platform__MemoryAssignment_8_3 )
            // InternalIoTECS.g:1217:3: rule__Platform__MemoryAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__Platform__MemoryAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getMemoryAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__3__Impl"


    // $ANTLR start "rule__Platform__Group_8__4"
    // InternalIoTECS.g:1225:1: rule__Platform__Group_8__4 : rule__Platform__Group_8__4__Impl ;
    public final void rule__Platform__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1229:1: ( rule__Platform__Group_8__4__Impl )
            // InternalIoTECS.g:1230:2: rule__Platform__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__4"


    // $ANTLR start "rule__Platform__Group_8__4__Impl"
    // InternalIoTECS.g:1236:1: rule__Platform__Group_8__4__Impl : ( 'G' ) ;
    public final void rule__Platform__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1240:1: ( ( 'G' ) )
            // InternalIoTECS.g:1241:1: ( 'G' )
            {
            // InternalIoTECS.g:1241:1: ( 'G' )
            // InternalIoTECS.g:1242:2: 'G'
            {
             before(grammarAccess.getPlatformAccess().getGKeyword_8_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getGKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_8__4__Impl"


    // $ANTLR start "rule__Platform__Group_9__0"
    // InternalIoTECS.g:1252:1: rule__Platform__Group_9__0 : rule__Platform__Group_9__0__Impl rule__Platform__Group_9__1 ;
    public final void rule__Platform__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1256:1: ( rule__Platform__Group_9__0__Impl rule__Platform__Group_9__1 )
            // InternalIoTECS.g:1257:2: rule__Platform__Group_9__0__Impl rule__Platform__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__Platform__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__0"


    // $ANTLR start "rule__Platform__Group_9__0__Impl"
    // InternalIoTECS.g:1264:1: rule__Platform__Group_9__0__Impl : ( 'ipVM:' ) ;
    public final void rule__Platform__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1268:1: ( ( 'ipVM:' ) )
            // InternalIoTECS.g:1269:1: ( 'ipVM:' )
            {
            // InternalIoTECS.g:1269:1: ( 'ipVM:' )
            // InternalIoTECS.g:1270:2: 'ipVM:'
            {
             before(grammarAccess.getPlatformAccess().getIpVMKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getIpVMKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__0__Impl"


    // $ANTLR start "rule__Platform__Group_9__1"
    // InternalIoTECS.g:1279:1: rule__Platform__Group_9__1 : rule__Platform__Group_9__1__Impl rule__Platform__Group_9__2 ;
    public final void rule__Platform__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1283:1: ( rule__Platform__Group_9__1__Impl rule__Platform__Group_9__2 )
            // InternalIoTECS.g:1284:2: rule__Platform__Group_9__1__Impl rule__Platform__Group_9__2
            {
            pushFollow(FOLLOW_16);
            rule__Platform__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__1"


    // $ANTLR start "rule__Platform__Group_9__1__Impl"
    // InternalIoTECS.g:1291:1: rule__Platform__Group_9__1__Impl : ( ( rule__Platform__IpVMAssignment_9_1 ) ) ;
    public final void rule__Platform__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1295:1: ( ( ( rule__Platform__IpVMAssignment_9_1 ) ) )
            // InternalIoTECS.g:1296:1: ( ( rule__Platform__IpVMAssignment_9_1 ) )
            {
            // InternalIoTECS.g:1296:1: ( ( rule__Platform__IpVMAssignment_9_1 ) )
            // InternalIoTECS.g:1297:2: ( rule__Platform__IpVMAssignment_9_1 )
            {
             before(grammarAccess.getPlatformAccess().getIpVMAssignment_9_1()); 
            // InternalIoTECS.g:1298:2: ( rule__Platform__IpVMAssignment_9_1 )
            // InternalIoTECS.g:1298:3: rule__Platform__IpVMAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Platform__IpVMAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getIpVMAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__1__Impl"


    // $ANTLR start "rule__Platform__Group_9__2"
    // InternalIoTECS.g:1306:1: rule__Platform__Group_9__2 : rule__Platform__Group_9__2__Impl rule__Platform__Group_9__3 ;
    public final void rule__Platform__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1310:1: ( rule__Platform__Group_9__2__Impl rule__Platform__Group_9__3 )
            // InternalIoTECS.g:1311:2: rule__Platform__Group_9__2__Impl rule__Platform__Group_9__3
            {
            pushFollow(FOLLOW_4);
            rule__Platform__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__2"


    // $ANTLR start "rule__Platform__Group_9__2__Impl"
    // InternalIoTECS.g:1318:1: rule__Platform__Group_9__2__Impl : ( 'userNameVM:' ) ;
    public final void rule__Platform__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1322:1: ( ( 'userNameVM:' ) )
            // InternalIoTECS.g:1323:1: ( 'userNameVM:' )
            {
            // InternalIoTECS.g:1323:1: ( 'userNameVM:' )
            // InternalIoTECS.g:1324:2: 'userNameVM:'
            {
             before(grammarAccess.getPlatformAccess().getUserNameVMKeyword_9_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getUserNameVMKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__2__Impl"


    // $ANTLR start "rule__Platform__Group_9__3"
    // InternalIoTECS.g:1333:1: rule__Platform__Group_9__3 : rule__Platform__Group_9__3__Impl rule__Platform__Group_9__4 ;
    public final void rule__Platform__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1337:1: ( rule__Platform__Group_9__3__Impl rule__Platform__Group_9__4 )
            // InternalIoTECS.g:1338:2: rule__Platform__Group_9__3__Impl rule__Platform__Group_9__4
            {
            pushFollow(FOLLOW_17);
            rule__Platform__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__3"


    // $ANTLR start "rule__Platform__Group_9__3__Impl"
    // InternalIoTECS.g:1345:1: rule__Platform__Group_9__3__Impl : ( ( rule__Platform__UserVMAssignment_9_3 ) ) ;
    public final void rule__Platform__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1349:1: ( ( ( rule__Platform__UserVMAssignment_9_3 ) ) )
            // InternalIoTECS.g:1350:1: ( ( rule__Platform__UserVMAssignment_9_3 ) )
            {
            // InternalIoTECS.g:1350:1: ( ( rule__Platform__UserVMAssignment_9_3 ) )
            // InternalIoTECS.g:1351:2: ( rule__Platform__UserVMAssignment_9_3 )
            {
             before(grammarAccess.getPlatformAccess().getUserVMAssignment_9_3()); 
            // InternalIoTECS.g:1352:2: ( rule__Platform__UserVMAssignment_9_3 )
            // InternalIoTECS.g:1352:3: rule__Platform__UserVMAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__Platform__UserVMAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getUserVMAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__3__Impl"


    // $ANTLR start "rule__Platform__Group_9__4"
    // InternalIoTECS.g:1360:1: rule__Platform__Group_9__4 : rule__Platform__Group_9__4__Impl rule__Platform__Group_9__5 ;
    public final void rule__Platform__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1364:1: ( rule__Platform__Group_9__4__Impl rule__Platform__Group_9__5 )
            // InternalIoTECS.g:1365:2: rule__Platform__Group_9__4__Impl rule__Platform__Group_9__5
            {
            pushFollow(FOLLOW_9);
            rule__Platform__Group_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_9__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__4"


    // $ANTLR start "rule__Platform__Group_9__4__Impl"
    // InternalIoTECS.g:1372:1: rule__Platform__Group_9__4__Impl : ( 'passwordVM:' ) ;
    public final void rule__Platform__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1376:1: ( ( 'passwordVM:' ) )
            // InternalIoTECS.g:1377:1: ( 'passwordVM:' )
            {
            // InternalIoTECS.g:1377:1: ( 'passwordVM:' )
            // InternalIoTECS.g:1378:2: 'passwordVM:'
            {
             before(grammarAccess.getPlatformAccess().getPasswordVMKeyword_9_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getPasswordVMKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__4__Impl"


    // $ANTLR start "rule__Platform__Group_9__5"
    // InternalIoTECS.g:1387:1: rule__Platform__Group_9__5 : rule__Platform__Group_9__5__Impl ;
    public final void rule__Platform__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1391:1: ( rule__Platform__Group_9__5__Impl )
            // InternalIoTECS.g:1392:2: rule__Platform__Group_9__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_9__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__5"


    // $ANTLR start "rule__Platform__Group_9__5__Impl"
    // InternalIoTECS.g:1398:1: rule__Platform__Group_9__5__Impl : ( ( rule__Platform__PasswordVMAssignment_9_5 ) ) ;
    public final void rule__Platform__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1402:1: ( ( ( rule__Platform__PasswordVMAssignment_9_5 ) ) )
            // InternalIoTECS.g:1403:1: ( ( rule__Platform__PasswordVMAssignment_9_5 ) )
            {
            // InternalIoTECS.g:1403:1: ( ( rule__Platform__PasswordVMAssignment_9_5 ) )
            // InternalIoTECS.g:1404:2: ( rule__Platform__PasswordVMAssignment_9_5 )
            {
             before(grammarAccess.getPlatformAccess().getPasswordVMAssignment_9_5()); 
            // InternalIoTECS.g:1405:2: ( rule__Platform__PasswordVMAssignment_9_5 )
            // InternalIoTECS.g:1405:3: rule__Platform__PasswordVMAssignment_9_5
            {
            pushFollow(FOLLOW_2);
            rule__Platform__PasswordVMAssignment_9_5();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getPasswordVMAssignment_9_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__Group_9__5__Impl"


    // $ANTLR start "rule__Simulator__Group__0"
    // InternalIoTECS.g:1414:1: rule__Simulator__Group__0 : rule__Simulator__Group__0__Impl rule__Simulator__Group__1 ;
    public final void rule__Simulator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1418:1: ( rule__Simulator__Group__0__Impl rule__Simulator__Group__1 )
            // InternalIoTECS.g:1419:2: rule__Simulator__Group__0__Impl rule__Simulator__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Simulator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__0"


    // $ANTLR start "rule__Simulator__Group__0__Impl"
    // InternalIoTECS.g:1426:1: rule__Simulator__Group__0__Impl : ( 'Simulator:' ) ;
    public final void rule__Simulator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1430:1: ( ( 'Simulator:' ) )
            // InternalIoTECS.g:1431:1: ( 'Simulator:' )
            {
            // InternalIoTECS.g:1431:1: ( 'Simulator:' )
            // InternalIoTECS.g:1432:2: 'Simulator:'
            {
             before(grammarAccess.getSimulatorAccess().getSimulatorKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getSimulatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__0__Impl"


    // $ANTLR start "rule__Simulator__Group__1"
    // InternalIoTECS.g:1441:1: rule__Simulator__Group__1 : rule__Simulator__Group__1__Impl rule__Simulator__Group__2 ;
    public final void rule__Simulator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1445:1: ( rule__Simulator__Group__1__Impl rule__Simulator__Group__2 )
            // InternalIoTECS.g:1446:2: rule__Simulator__Group__1__Impl rule__Simulator__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Simulator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__1"


    // $ANTLR start "rule__Simulator__Group__1__Impl"
    // InternalIoTECS.g:1453:1: rule__Simulator__Group__1__Impl : ( '{' ) ;
    public final void rule__Simulator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1457:1: ( ( '{' ) )
            // InternalIoTECS.g:1458:1: ( '{' )
            {
            // InternalIoTECS.g:1458:1: ( '{' )
            // InternalIoTECS.g:1459:2: '{'
            {
             before(grammarAccess.getSimulatorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__1__Impl"


    // $ANTLR start "rule__Simulator__Group__2"
    // InternalIoTECS.g:1468:1: rule__Simulator__Group__2 : rule__Simulator__Group__2__Impl rule__Simulator__Group__3 ;
    public final void rule__Simulator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1472:1: ( rule__Simulator__Group__2__Impl rule__Simulator__Group__3 )
            // InternalIoTECS.g:1473:2: rule__Simulator__Group__2__Impl rule__Simulator__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Simulator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__2"


    // $ANTLR start "rule__Simulator__Group__2__Impl"
    // InternalIoTECS.g:1480:1: rule__Simulator__Group__2__Impl : ( 'duration:' ) ;
    public final void rule__Simulator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1484:1: ( ( 'duration:' ) )
            // InternalIoTECS.g:1485:1: ( 'duration:' )
            {
            // InternalIoTECS.g:1485:1: ( 'duration:' )
            // InternalIoTECS.g:1486:2: 'duration:'
            {
             before(grammarAccess.getSimulatorAccess().getDurationKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getDurationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__2__Impl"


    // $ANTLR start "rule__Simulator__Group__3"
    // InternalIoTECS.g:1495:1: rule__Simulator__Group__3 : rule__Simulator__Group__3__Impl rule__Simulator__Group__4 ;
    public final void rule__Simulator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1499:1: ( rule__Simulator__Group__3__Impl rule__Simulator__Group__4 )
            // InternalIoTECS.g:1500:2: rule__Simulator__Group__3__Impl rule__Simulator__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Simulator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__3"


    // $ANTLR start "rule__Simulator__Group__3__Impl"
    // InternalIoTECS.g:1507:1: rule__Simulator__Group__3__Impl : ( ( rule__Simulator__DurationAssignment_3 ) ) ;
    public final void rule__Simulator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1511:1: ( ( ( rule__Simulator__DurationAssignment_3 ) ) )
            // InternalIoTECS.g:1512:1: ( ( rule__Simulator__DurationAssignment_3 ) )
            {
            // InternalIoTECS.g:1512:1: ( ( rule__Simulator__DurationAssignment_3 ) )
            // InternalIoTECS.g:1513:2: ( rule__Simulator__DurationAssignment_3 )
            {
             before(grammarAccess.getSimulatorAccess().getDurationAssignment_3()); 
            // InternalIoTECS.g:1514:2: ( rule__Simulator__DurationAssignment_3 )
            // InternalIoTECS.g:1514:3: rule__Simulator__DurationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Simulator__DurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimulatorAccess().getDurationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__3__Impl"


    // $ANTLR start "rule__Simulator__Group__4"
    // InternalIoTECS.g:1522:1: rule__Simulator__Group__4 : rule__Simulator__Group__4__Impl rule__Simulator__Group__5 ;
    public final void rule__Simulator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1526:1: ( rule__Simulator__Group__4__Impl rule__Simulator__Group__5 )
            // InternalIoTECS.g:1527:2: rule__Simulator__Group__4__Impl rule__Simulator__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Simulator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__4"


    // $ANTLR start "rule__Simulator__Group__4__Impl"
    // InternalIoTECS.g:1534:1: rule__Simulator__Group__4__Impl : ( ( rule__Simulator__DurationUnitAssignment_4 ) ) ;
    public final void rule__Simulator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1538:1: ( ( ( rule__Simulator__DurationUnitAssignment_4 ) ) )
            // InternalIoTECS.g:1539:1: ( ( rule__Simulator__DurationUnitAssignment_4 ) )
            {
            // InternalIoTECS.g:1539:1: ( ( rule__Simulator__DurationUnitAssignment_4 ) )
            // InternalIoTECS.g:1540:2: ( rule__Simulator__DurationUnitAssignment_4 )
            {
             before(grammarAccess.getSimulatorAccess().getDurationUnitAssignment_4()); 
            // InternalIoTECS.g:1541:2: ( rule__Simulator__DurationUnitAssignment_4 )
            // InternalIoTECS.g:1541:3: rule__Simulator__DurationUnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Simulator__DurationUnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimulatorAccess().getDurationUnitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__4__Impl"


    // $ANTLR start "rule__Simulator__Group__5"
    // InternalIoTECS.g:1549:1: rule__Simulator__Group__5 : rule__Simulator__Group__5__Impl rule__Simulator__Group__6 ;
    public final void rule__Simulator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1553:1: ( rule__Simulator__Group__5__Impl rule__Simulator__Group__6 )
            // InternalIoTECS.g:1554:2: rule__Simulator__Group__5__Impl rule__Simulator__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Simulator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__5"


    // $ANTLR start "rule__Simulator__Group__5__Impl"
    // InternalIoTECS.g:1561:1: rule__Simulator__Group__5__Impl : ( 'step:' ) ;
    public final void rule__Simulator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1565:1: ( ( 'step:' ) )
            // InternalIoTECS.g:1566:1: ( 'step:' )
            {
            // InternalIoTECS.g:1566:1: ( 'step:' )
            // InternalIoTECS.g:1567:2: 'step:'
            {
             before(grammarAccess.getSimulatorAccess().getStepKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getStepKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__5__Impl"


    // $ANTLR start "rule__Simulator__Group__6"
    // InternalIoTECS.g:1576:1: rule__Simulator__Group__6 : rule__Simulator__Group__6__Impl rule__Simulator__Group__7 ;
    public final void rule__Simulator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1580:1: ( rule__Simulator__Group__6__Impl rule__Simulator__Group__7 )
            // InternalIoTECS.g:1581:2: rule__Simulator__Group__6__Impl rule__Simulator__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Simulator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__6"


    // $ANTLR start "rule__Simulator__Group__6__Impl"
    // InternalIoTECS.g:1588:1: rule__Simulator__Group__6__Impl : ( ( rule__Simulator__StepAssignment_6 ) ) ;
    public final void rule__Simulator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1592:1: ( ( ( rule__Simulator__StepAssignment_6 ) ) )
            // InternalIoTECS.g:1593:1: ( ( rule__Simulator__StepAssignment_6 ) )
            {
            // InternalIoTECS.g:1593:1: ( ( rule__Simulator__StepAssignment_6 ) )
            // InternalIoTECS.g:1594:2: ( rule__Simulator__StepAssignment_6 )
            {
             before(grammarAccess.getSimulatorAccess().getStepAssignment_6()); 
            // InternalIoTECS.g:1595:2: ( rule__Simulator__StepAssignment_6 )
            // InternalIoTECS.g:1595:3: rule__Simulator__StepAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Simulator__StepAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSimulatorAccess().getStepAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__6__Impl"


    // $ANTLR start "rule__Simulator__Group__7"
    // InternalIoTECS.g:1603:1: rule__Simulator__Group__7 : rule__Simulator__Group__7__Impl rule__Simulator__Group__8 ;
    public final void rule__Simulator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1607:1: ( rule__Simulator__Group__7__Impl rule__Simulator__Group__8 )
            // InternalIoTECS.g:1608:2: rule__Simulator__Group__7__Impl rule__Simulator__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Simulator__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__7"


    // $ANTLR start "rule__Simulator__Group__7__Impl"
    // InternalIoTECS.g:1615:1: rule__Simulator__Group__7__Impl : ( ( rule__Simulator__StepUnitAssignment_7 ) ) ;
    public final void rule__Simulator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1619:1: ( ( ( rule__Simulator__StepUnitAssignment_7 ) ) )
            // InternalIoTECS.g:1620:1: ( ( rule__Simulator__StepUnitAssignment_7 ) )
            {
            // InternalIoTECS.g:1620:1: ( ( rule__Simulator__StepUnitAssignment_7 ) )
            // InternalIoTECS.g:1621:2: ( rule__Simulator__StepUnitAssignment_7 )
            {
             before(grammarAccess.getSimulatorAccess().getStepUnitAssignment_7()); 
            // InternalIoTECS.g:1622:2: ( rule__Simulator__StepUnitAssignment_7 )
            // InternalIoTECS.g:1622:3: rule__Simulator__StepUnitAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Simulator__StepUnitAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSimulatorAccess().getStepUnitAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__7__Impl"


    // $ANTLR start "rule__Simulator__Group__8"
    // InternalIoTECS.g:1630:1: rule__Simulator__Group__8 : rule__Simulator__Group__8__Impl rule__Simulator__Group__9 ;
    public final void rule__Simulator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1634:1: ( rule__Simulator__Group__8__Impl rule__Simulator__Group__9 )
            // InternalIoTECS.g:1635:2: rule__Simulator__Group__8__Impl rule__Simulator__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Simulator__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__8"


    // $ANTLR start "rule__Simulator__Group__8__Impl"
    // InternalIoTECS.g:1642:1: rule__Simulator__Group__8__Impl : ( 'simulationNodes:' ) ;
    public final void rule__Simulator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1646:1: ( ( 'simulationNodes:' ) )
            // InternalIoTECS.g:1647:1: ( 'simulationNodes:' )
            {
            // InternalIoTECS.g:1647:1: ( 'simulationNodes:' )
            // InternalIoTECS.g:1648:2: 'simulationNodes:'
            {
             before(grammarAccess.getSimulatorAccess().getSimulationNodesKeyword_8()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getSimulationNodesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__8__Impl"


    // $ANTLR start "rule__Simulator__Group__9"
    // InternalIoTECS.g:1657:1: rule__Simulator__Group__9 : rule__Simulator__Group__9__Impl rule__Simulator__Group__10 ;
    public final void rule__Simulator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1661:1: ( rule__Simulator__Group__9__Impl rule__Simulator__Group__10 )
            // InternalIoTECS.g:1662:2: rule__Simulator__Group__9__Impl rule__Simulator__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Simulator__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__9"


    // $ANTLR start "rule__Simulator__Group__9__Impl"
    // InternalIoTECS.g:1669:1: rule__Simulator__Group__9__Impl : ( '{' ) ;
    public final void rule__Simulator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1673:1: ( ( '{' ) )
            // InternalIoTECS.g:1674:1: ( '{' )
            {
            // InternalIoTECS.g:1674:1: ( '{' )
            // InternalIoTECS.g:1675:2: '{'
            {
             before(grammarAccess.getSimulatorAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__9__Impl"


    // $ANTLR start "rule__Simulator__Group__10"
    // InternalIoTECS.g:1684:1: rule__Simulator__Group__10 : rule__Simulator__Group__10__Impl rule__Simulator__Group__11 ;
    public final void rule__Simulator__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1688:1: ( rule__Simulator__Group__10__Impl rule__Simulator__Group__11 )
            // InternalIoTECS.g:1689:2: rule__Simulator__Group__10__Impl rule__Simulator__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__Simulator__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__10"


    // $ANTLR start "rule__Simulator__Group__10__Impl"
    // InternalIoTECS.g:1696:1: rule__Simulator__Group__10__Impl : ( ( rule__Simulator__SimulationNodesAssignment_10 )* ) ;
    public final void rule__Simulator__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1700:1: ( ( ( rule__Simulator__SimulationNodesAssignment_10 )* ) )
            // InternalIoTECS.g:1701:1: ( ( rule__Simulator__SimulationNodesAssignment_10 )* )
            {
            // InternalIoTECS.g:1701:1: ( ( rule__Simulator__SimulationNodesAssignment_10 )* )
            // InternalIoTECS.g:1702:2: ( rule__Simulator__SimulationNodesAssignment_10 )*
            {
             before(grammarAccess.getSimulatorAccess().getSimulationNodesAssignment_10()); 
            // InternalIoTECS.g:1703:2: ( rule__Simulator__SimulationNodesAssignment_10 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoTECS.g:1703:3: rule__Simulator__SimulationNodesAssignment_10
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Simulator__SimulationNodesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSimulatorAccess().getSimulationNodesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__10__Impl"


    // $ANTLR start "rule__Simulator__Group__11"
    // InternalIoTECS.g:1711:1: rule__Simulator__Group__11 : rule__Simulator__Group__11__Impl rule__Simulator__Group__12 ;
    public final void rule__Simulator__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1715:1: ( rule__Simulator__Group__11__Impl rule__Simulator__Group__12 )
            // InternalIoTECS.g:1716:2: rule__Simulator__Group__11__Impl rule__Simulator__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Simulator__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulator__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__11"


    // $ANTLR start "rule__Simulator__Group__11__Impl"
    // InternalIoTECS.g:1723:1: rule__Simulator__Group__11__Impl : ( '}' ) ;
    public final void rule__Simulator__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1727:1: ( ( '}' ) )
            // InternalIoTECS.g:1728:1: ( '}' )
            {
            // InternalIoTECS.g:1728:1: ( '}' )
            // InternalIoTECS.g:1729:2: '}'
            {
             before(grammarAccess.getSimulatorAccess().getRightCurlyBracketKeyword_11()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__11__Impl"


    // $ANTLR start "rule__Simulator__Group__12"
    // InternalIoTECS.g:1738:1: rule__Simulator__Group__12 : rule__Simulator__Group__12__Impl ;
    public final void rule__Simulator__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1742:1: ( rule__Simulator__Group__12__Impl )
            // InternalIoTECS.g:1743:2: rule__Simulator__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simulator__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__12"


    // $ANTLR start "rule__Simulator__Group__12__Impl"
    // InternalIoTECS.g:1749:1: rule__Simulator__Group__12__Impl : ( '}' ) ;
    public final void rule__Simulator__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1753:1: ( ( '}' ) )
            // InternalIoTECS.g:1754:1: ( '}' )
            {
            // InternalIoTECS.g:1754:1: ( '}' )
            // InternalIoTECS.g:1755:2: '}'
            {
             before(grammarAccess.getSimulatorAccess().getRightCurlyBracketKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__Group__12__Impl"


    // $ANTLR start "rule__Cloud__Group__0"
    // InternalIoTECS.g:1765:1: rule__Cloud__Group__0 : rule__Cloud__Group__0__Impl rule__Cloud__Group__1 ;
    public final void rule__Cloud__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1769:1: ( rule__Cloud__Group__0__Impl rule__Cloud__Group__1 )
            // InternalIoTECS.g:1770:2: rule__Cloud__Group__0__Impl rule__Cloud__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cloud__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__0"


    // $ANTLR start "rule__Cloud__Group__0__Impl"
    // InternalIoTECS.g:1777:1: rule__Cloud__Group__0__Impl : ( 'Cloud:' ) ;
    public final void rule__Cloud__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1781:1: ( ( 'Cloud:' ) )
            // InternalIoTECS.g:1782:1: ( 'Cloud:' )
            {
            // InternalIoTECS.g:1782:1: ( 'Cloud:' )
            // InternalIoTECS.g:1783:2: 'Cloud:'
            {
             before(grammarAccess.getCloudAccess().getCloudKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getCloudKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__0__Impl"


    // $ANTLR start "rule__Cloud__Group__1"
    // InternalIoTECS.g:1792:1: rule__Cloud__Group__1 : rule__Cloud__Group__1__Impl rule__Cloud__Group__2 ;
    public final void rule__Cloud__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1796:1: ( rule__Cloud__Group__1__Impl rule__Cloud__Group__2 )
            // InternalIoTECS.g:1797:2: rule__Cloud__Group__1__Impl rule__Cloud__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Cloud__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__1"


    // $ANTLR start "rule__Cloud__Group__1__Impl"
    // InternalIoTECS.g:1804:1: rule__Cloud__Group__1__Impl : ( ( rule__Cloud__NameAssignment_1 ) ) ;
    public final void rule__Cloud__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1808:1: ( ( ( rule__Cloud__NameAssignment_1 ) ) )
            // InternalIoTECS.g:1809:1: ( ( rule__Cloud__NameAssignment_1 ) )
            {
            // InternalIoTECS.g:1809:1: ( ( rule__Cloud__NameAssignment_1 ) )
            // InternalIoTECS.g:1810:2: ( rule__Cloud__NameAssignment_1 )
            {
             before(grammarAccess.getCloudAccess().getNameAssignment_1()); 
            // InternalIoTECS.g:1811:2: ( rule__Cloud__NameAssignment_1 )
            // InternalIoTECS.g:1811:3: rule__Cloud__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__1__Impl"


    // $ANTLR start "rule__Cloud__Group__2"
    // InternalIoTECS.g:1819:1: rule__Cloud__Group__2 : rule__Cloud__Group__2__Impl rule__Cloud__Group__3 ;
    public final void rule__Cloud__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1823:1: ( rule__Cloud__Group__2__Impl rule__Cloud__Group__3 )
            // InternalIoTECS.g:1824:2: rule__Cloud__Group__2__Impl rule__Cloud__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Cloud__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__2"


    // $ANTLR start "rule__Cloud__Group__2__Impl"
    // InternalIoTECS.g:1831:1: rule__Cloud__Group__2__Impl : ( '{' ) ;
    public final void rule__Cloud__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1835:1: ( ( '{' ) )
            // InternalIoTECS.g:1836:1: ( '{' )
            {
            // InternalIoTECS.g:1836:1: ( '{' )
            // InternalIoTECS.g:1837:2: '{'
            {
             before(grammarAccess.getCloudAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__2__Impl"


    // $ANTLR start "rule__Cloud__Group__3"
    // InternalIoTECS.g:1846:1: rule__Cloud__Group__3 : rule__Cloud__Group__3__Impl rule__Cloud__Group__4 ;
    public final void rule__Cloud__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1850:1: ( rule__Cloud__Group__3__Impl rule__Cloud__Group__4 )
            // InternalIoTECS.g:1851:2: rule__Cloud__Group__3__Impl rule__Cloud__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Cloud__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__3"


    // $ANTLR start "rule__Cloud__Group__3__Impl"
    // InternalIoTECS.g:1858:1: rule__Cloud__Group__3__Impl : ( 'ip:' ) ;
    public final void rule__Cloud__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1862:1: ( ( 'ip:' ) )
            // InternalIoTECS.g:1863:1: ( 'ip:' )
            {
            // InternalIoTECS.g:1863:1: ( 'ip:' )
            // InternalIoTECS.g:1864:2: 'ip:'
            {
             before(grammarAccess.getCloudAccess().getIpKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getIpKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__3__Impl"


    // $ANTLR start "rule__Cloud__Group__4"
    // InternalIoTECS.g:1873:1: rule__Cloud__Group__4 : rule__Cloud__Group__4__Impl rule__Cloud__Group__5 ;
    public final void rule__Cloud__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1877:1: ( rule__Cloud__Group__4__Impl rule__Cloud__Group__5 )
            // InternalIoTECS.g:1878:2: rule__Cloud__Group__4__Impl rule__Cloud__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Cloud__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__4"


    // $ANTLR start "rule__Cloud__Group__4__Impl"
    // InternalIoTECS.g:1885:1: rule__Cloud__Group__4__Impl : ( ( rule__Cloud__IpAssignment_4 ) ) ;
    public final void rule__Cloud__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1889:1: ( ( ( rule__Cloud__IpAssignment_4 ) ) )
            // InternalIoTECS.g:1890:1: ( ( rule__Cloud__IpAssignment_4 ) )
            {
            // InternalIoTECS.g:1890:1: ( ( rule__Cloud__IpAssignment_4 ) )
            // InternalIoTECS.g:1891:2: ( rule__Cloud__IpAssignment_4 )
            {
             before(grammarAccess.getCloudAccess().getIpAssignment_4()); 
            // InternalIoTECS.g:1892:2: ( rule__Cloud__IpAssignment_4 )
            // InternalIoTECS.g:1892:3: rule__Cloud__IpAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__IpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getIpAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__4__Impl"


    // $ANTLR start "rule__Cloud__Group__5"
    // InternalIoTECS.g:1900:1: rule__Cloud__Group__5 : rule__Cloud__Group__5__Impl rule__Cloud__Group__6 ;
    public final void rule__Cloud__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1904:1: ( rule__Cloud__Group__5__Impl rule__Cloud__Group__6 )
            // InternalIoTECS.g:1905:2: rule__Cloud__Group__5__Impl rule__Cloud__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Cloud__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__5"


    // $ANTLR start "rule__Cloud__Group__5__Impl"
    // InternalIoTECS.g:1912:1: rule__Cloud__Group__5__Impl : ( 'port:' ) ;
    public final void rule__Cloud__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1916:1: ( ( 'port:' ) )
            // InternalIoTECS.g:1917:1: ( 'port:' )
            {
            // InternalIoTECS.g:1917:1: ( 'port:' )
            // InternalIoTECS.g:1918:2: 'port:'
            {
             before(grammarAccess.getCloudAccess().getPortKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getPortKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__5__Impl"


    // $ANTLR start "rule__Cloud__Group__6"
    // InternalIoTECS.g:1927:1: rule__Cloud__Group__6 : rule__Cloud__Group__6__Impl rule__Cloud__Group__7 ;
    public final void rule__Cloud__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1931:1: ( rule__Cloud__Group__6__Impl rule__Cloud__Group__7 )
            // InternalIoTECS.g:1932:2: rule__Cloud__Group__6__Impl rule__Cloud__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Cloud__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__6"


    // $ANTLR start "rule__Cloud__Group__6__Impl"
    // InternalIoTECS.g:1939:1: rule__Cloud__Group__6__Impl : ( ( rule__Cloud__PortAssignment_6 ) ) ;
    public final void rule__Cloud__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1943:1: ( ( ( rule__Cloud__PortAssignment_6 ) ) )
            // InternalIoTECS.g:1944:1: ( ( rule__Cloud__PortAssignment_6 ) )
            {
            // InternalIoTECS.g:1944:1: ( ( rule__Cloud__PortAssignment_6 ) )
            // InternalIoTECS.g:1945:2: ( rule__Cloud__PortAssignment_6 )
            {
             before(grammarAccess.getCloudAccess().getPortAssignment_6()); 
            // InternalIoTECS.g:1946:2: ( rule__Cloud__PortAssignment_6 )
            // InternalIoTECS.g:1946:3: rule__Cloud__PortAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__PortAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getPortAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__6__Impl"


    // $ANTLR start "rule__Cloud__Group__7"
    // InternalIoTECS.g:1954:1: rule__Cloud__Group__7 : rule__Cloud__Group__7__Impl rule__Cloud__Group__8 ;
    public final void rule__Cloud__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1958:1: ( rule__Cloud__Group__7__Impl rule__Cloud__Group__8 )
            // InternalIoTECS.g:1959:2: rule__Cloud__Group__7__Impl rule__Cloud__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Cloud__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__7"


    // $ANTLR start "rule__Cloud__Group__7__Impl"
    // InternalIoTECS.g:1966:1: rule__Cloud__Group__7__Impl : ( ( rule__Cloud__Group_7__0 )? ) ;
    public final void rule__Cloud__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1970:1: ( ( ( rule__Cloud__Group_7__0 )? ) )
            // InternalIoTECS.g:1971:1: ( ( rule__Cloud__Group_7__0 )? )
            {
            // InternalIoTECS.g:1971:1: ( ( rule__Cloud__Group_7__0 )? )
            // InternalIoTECS.g:1972:2: ( rule__Cloud__Group_7__0 )?
            {
             before(grammarAccess.getCloudAccess().getGroup_7()); 
            // InternalIoTECS.g:1973:2: ( rule__Cloud__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoTECS.g:1973:3: rule__Cloud__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cloud__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCloudAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__7__Impl"


    // $ANTLR start "rule__Cloud__Group__8"
    // InternalIoTECS.g:1981:1: rule__Cloud__Group__8 : rule__Cloud__Group__8__Impl rule__Cloud__Group__9 ;
    public final void rule__Cloud__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1985:1: ( rule__Cloud__Group__8__Impl rule__Cloud__Group__9 )
            // InternalIoTECS.g:1986:2: rule__Cloud__Group__8__Impl rule__Cloud__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Cloud__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__8"


    // $ANTLR start "rule__Cloud__Group__8__Impl"
    // InternalIoTECS.g:1993:1: rule__Cloud__Group__8__Impl : ( ( rule__Cloud__Group_8__0 )? ) ;
    public final void rule__Cloud__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:1997:1: ( ( ( rule__Cloud__Group_8__0 )? ) )
            // InternalIoTECS.g:1998:1: ( ( rule__Cloud__Group_8__0 )? )
            {
            // InternalIoTECS.g:1998:1: ( ( rule__Cloud__Group_8__0 )? )
            // InternalIoTECS.g:1999:2: ( rule__Cloud__Group_8__0 )?
            {
             before(grammarAccess.getCloudAccess().getGroup_8()); 
            // InternalIoTECS.g:2000:2: ( rule__Cloud__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTECS.g:2000:3: rule__Cloud__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cloud__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCloudAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__8__Impl"


    // $ANTLR start "rule__Cloud__Group__9"
    // InternalIoTECS.g:2008:1: rule__Cloud__Group__9 : rule__Cloud__Group__9__Impl ;
    public final void rule__Cloud__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2012:1: ( rule__Cloud__Group__9__Impl )
            // InternalIoTECS.g:2013:2: rule__Cloud__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__9"


    // $ANTLR start "rule__Cloud__Group__9__Impl"
    // InternalIoTECS.g:2019:1: rule__Cloud__Group__9__Impl : ( '}' ) ;
    public final void rule__Cloud__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2023:1: ( ( '}' ) )
            // InternalIoTECS.g:2024:1: ( '}' )
            {
            // InternalIoTECS.g:2024:1: ( '}' )
            // InternalIoTECS.g:2025:2: '}'
            {
             before(grammarAccess.getCloudAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__9__Impl"


    // $ANTLR start "rule__Cloud__Group_7__0"
    // InternalIoTECS.g:2035:1: rule__Cloud__Group_7__0 : rule__Cloud__Group_7__0__Impl rule__Cloud__Group_7__1 ;
    public final void rule__Cloud__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2039:1: ( rule__Cloud__Group_7__0__Impl rule__Cloud__Group_7__1 )
            // InternalIoTECS.g:2040:2: rule__Cloud__Group_7__0__Impl rule__Cloud__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Cloud__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__0"


    // $ANTLR start "rule__Cloud__Group_7__0__Impl"
    // InternalIoTECS.g:2047:1: rule__Cloud__Group_7__0__Impl : ( 'usrname:' ) ;
    public final void rule__Cloud__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2051:1: ( ( 'usrname:' ) )
            // InternalIoTECS.g:2052:1: ( 'usrname:' )
            {
            // InternalIoTECS.g:2052:1: ( 'usrname:' )
            // InternalIoTECS.g:2053:2: 'usrname:'
            {
             before(grammarAccess.getCloudAccess().getUsrnameKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getUsrnameKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__0__Impl"


    // $ANTLR start "rule__Cloud__Group_7__1"
    // InternalIoTECS.g:2062:1: rule__Cloud__Group_7__1 : rule__Cloud__Group_7__1__Impl rule__Cloud__Group_7__2 ;
    public final void rule__Cloud__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2066:1: ( rule__Cloud__Group_7__1__Impl rule__Cloud__Group_7__2 )
            // InternalIoTECS.g:2067:2: rule__Cloud__Group_7__1__Impl rule__Cloud__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__Cloud__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__1"


    // $ANTLR start "rule__Cloud__Group_7__1__Impl"
    // InternalIoTECS.g:2074:1: rule__Cloud__Group_7__1__Impl : ( ( rule__Cloud__UsrnameAssignment_7_1 ) ) ;
    public final void rule__Cloud__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2078:1: ( ( ( rule__Cloud__UsrnameAssignment_7_1 ) ) )
            // InternalIoTECS.g:2079:1: ( ( rule__Cloud__UsrnameAssignment_7_1 ) )
            {
            // InternalIoTECS.g:2079:1: ( ( rule__Cloud__UsrnameAssignment_7_1 ) )
            // InternalIoTECS.g:2080:2: ( rule__Cloud__UsrnameAssignment_7_1 )
            {
             before(grammarAccess.getCloudAccess().getUsrnameAssignment_7_1()); 
            // InternalIoTECS.g:2081:2: ( rule__Cloud__UsrnameAssignment_7_1 )
            // InternalIoTECS.g:2081:3: rule__Cloud__UsrnameAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__UsrnameAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getUsrnameAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__1__Impl"


    // $ANTLR start "rule__Cloud__Group_7__2"
    // InternalIoTECS.g:2089:1: rule__Cloud__Group_7__2 : rule__Cloud__Group_7__2__Impl rule__Cloud__Group_7__3 ;
    public final void rule__Cloud__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2093:1: ( rule__Cloud__Group_7__2__Impl rule__Cloud__Group_7__3 )
            // InternalIoTECS.g:2094:2: rule__Cloud__Group_7__2__Impl rule__Cloud__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__Cloud__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__2"


    // $ANTLR start "rule__Cloud__Group_7__2__Impl"
    // InternalIoTECS.g:2101:1: rule__Cloud__Group_7__2__Impl : ( 'password:' ) ;
    public final void rule__Cloud__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2105:1: ( ( 'password:' ) )
            // InternalIoTECS.g:2106:1: ( 'password:' )
            {
            // InternalIoTECS.g:2106:1: ( 'password:' )
            // InternalIoTECS.g:2107:2: 'password:'
            {
             before(grammarAccess.getCloudAccess().getPasswordKeyword_7_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getPasswordKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__2__Impl"


    // $ANTLR start "rule__Cloud__Group_7__3"
    // InternalIoTECS.g:2116:1: rule__Cloud__Group_7__3 : rule__Cloud__Group_7__3__Impl rule__Cloud__Group_7__4 ;
    public final void rule__Cloud__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2120:1: ( rule__Cloud__Group_7__3__Impl rule__Cloud__Group_7__4 )
            // InternalIoTECS.g:2121:2: rule__Cloud__Group_7__3__Impl rule__Cloud__Group_7__4
            {
            pushFollow(FOLLOW_28);
            rule__Cloud__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__3"


    // $ANTLR start "rule__Cloud__Group_7__3__Impl"
    // InternalIoTECS.g:2128:1: rule__Cloud__Group_7__3__Impl : ( ( rule__Cloud__PasswordAssignment_7_3 ) ) ;
    public final void rule__Cloud__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2132:1: ( ( ( rule__Cloud__PasswordAssignment_7_3 ) ) )
            // InternalIoTECS.g:2133:1: ( ( rule__Cloud__PasswordAssignment_7_3 ) )
            {
            // InternalIoTECS.g:2133:1: ( ( rule__Cloud__PasswordAssignment_7_3 ) )
            // InternalIoTECS.g:2134:2: ( rule__Cloud__PasswordAssignment_7_3 )
            {
             before(grammarAccess.getCloudAccess().getPasswordAssignment_7_3()); 
            // InternalIoTECS.g:2135:2: ( rule__Cloud__PasswordAssignment_7_3 )
            // InternalIoTECS.g:2135:3: rule__Cloud__PasswordAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__PasswordAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getPasswordAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__3__Impl"


    // $ANTLR start "rule__Cloud__Group_7__4"
    // InternalIoTECS.g:2143:1: rule__Cloud__Group_7__4 : rule__Cloud__Group_7__4__Impl rule__Cloud__Group_7__5 ;
    public final void rule__Cloud__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2147:1: ( rule__Cloud__Group_7__4__Impl rule__Cloud__Group_7__5 )
            // InternalIoTECS.g:2148:2: rule__Cloud__Group_7__4__Impl rule__Cloud__Group_7__5
            {
            pushFollow(FOLLOW_11);
            rule__Cloud__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__4"


    // $ANTLR start "rule__Cloud__Group_7__4__Impl"
    // InternalIoTECS.g:2155:1: rule__Cloud__Group_7__4__Impl : ( 'workload:' ) ;
    public final void rule__Cloud__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2159:1: ( ( 'workload:' ) )
            // InternalIoTECS.g:2160:1: ( 'workload:' )
            {
            // InternalIoTECS.g:2160:1: ( 'workload:' )
            // InternalIoTECS.g:2161:2: 'workload:'
            {
             before(grammarAccess.getCloudAccess().getWorkloadKeyword_7_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getWorkloadKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__4__Impl"


    // $ANTLR start "rule__Cloud__Group_7__5"
    // InternalIoTECS.g:2170:1: rule__Cloud__Group_7__5 : rule__Cloud__Group_7__5__Impl rule__Cloud__Group_7__6 ;
    public final void rule__Cloud__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2174:1: ( rule__Cloud__Group_7__5__Impl rule__Cloud__Group_7__6 )
            // InternalIoTECS.g:2175:2: rule__Cloud__Group_7__5__Impl rule__Cloud__Group_7__6
            {
            pushFollow(FOLLOW_29);
            rule__Cloud__Group_7__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group_7__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__5"


    // $ANTLR start "rule__Cloud__Group_7__5__Impl"
    // InternalIoTECS.g:2182:1: rule__Cloud__Group_7__5__Impl : ( ( rule__Cloud__WorkloadAssignment_7_5 ) ) ;
    public final void rule__Cloud__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2186:1: ( ( ( rule__Cloud__WorkloadAssignment_7_5 ) ) )
            // InternalIoTECS.g:2187:1: ( ( rule__Cloud__WorkloadAssignment_7_5 ) )
            {
            // InternalIoTECS.g:2187:1: ( ( rule__Cloud__WorkloadAssignment_7_5 ) )
            // InternalIoTECS.g:2188:2: ( rule__Cloud__WorkloadAssignment_7_5 )
            {
             before(grammarAccess.getCloudAccess().getWorkloadAssignment_7_5()); 
            // InternalIoTECS.g:2189:2: ( rule__Cloud__WorkloadAssignment_7_5 )
            // InternalIoTECS.g:2189:3: rule__Cloud__WorkloadAssignment_7_5
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__WorkloadAssignment_7_5();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getWorkloadAssignment_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__5__Impl"


    // $ANTLR start "rule__Cloud__Group_7__6"
    // InternalIoTECS.g:2197:1: rule__Cloud__Group_7__6 : rule__Cloud__Group_7__6__Impl ;
    public final void rule__Cloud__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2201:1: ( rule__Cloud__Group_7__6__Impl )
            // InternalIoTECS.g:2202:2: rule__Cloud__Group_7__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group_7__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__6"


    // $ANTLR start "rule__Cloud__Group_7__6__Impl"
    // InternalIoTECS.g:2208:1: rule__Cloud__Group_7__6__Impl : ( ( rule__Cloud__WorkloadUnitAssignment_7_6 ) ) ;
    public final void rule__Cloud__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2212:1: ( ( ( rule__Cloud__WorkloadUnitAssignment_7_6 ) ) )
            // InternalIoTECS.g:2213:1: ( ( rule__Cloud__WorkloadUnitAssignment_7_6 ) )
            {
            // InternalIoTECS.g:2213:1: ( ( rule__Cloud__WorkloadUnitAssignment_7_6 ) )
            // InternalIoTECS.g:2214:2: ( rule__Cloud__WorkloadUnitAssignment_7_6 )
            {
             before(grammarAccess.getCloudAccess().getWorkloadUnitAssignment_7_6()); 
            // InternalIoTECS.g:2215:2: ( rule__Cloud__WorkloadUnitAssignment_7_6 )
            // InternalIoTECS.g:2215:3: rule__Cloud__WorkloadUnitAssignment_7_6
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__WorkloadUnitAssignment_7_6();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getWorkloadUnitAssignment_7_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_7__6__Impl"


    // $ANTLR start "rule__Cloud__Group_8__0"
    // InternalIoTECS.g:2224:1: rule__Cloud__Group_8__0 : rule__Cloud__Group_8__0__Impl rule__Cloud__Group_8__1 ;
    public final void rule__Cloud__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2228:1: ( rule__Cloud__Group_8__0__Impl rule__Cloud__Group_8__1 )
            // InternalIoTECS.g:2229:2: rule__Cloud__Group_8__0__Impl rule__Cloud__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__Cloud__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cloud__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_8__0"


    // $ANTLR start "rule__Cloud__Group_8__0__Impl"
    // InternalIoTECS.g:2236:1: rule__Cloud__Group_8__0__Impl : ( 'networkAdapter:' ) ;
    public final void rule__Cloud__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2240:1: ( ( 'networkAdapter:' ) )
            // InternalIoTECS.g:2241:1: ( 'networkAdapter:' )
            {
            // InternalIoTECS.g:2241:1: ( 'networkAdapter:' )
            // InternalIoTECS.g:2242:2: 'networkAdapter:'
            {
             before(grammarAccess.getCloudAccess().getNetworkAdapterKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getNetworkAdapterKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_8__0__Impl"


    // $ANTLR start "rule__Cloud__Group_8__1"
    // InternalIoTECS.g:2251:1: rule__Cloud__Group_8__1 : rule__Cloud__Group_8__1__Impl ;
    public final void rule__Cloud__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2255:1: ( rule__Cloud__Group_8__1__Impl )
            // InternalIoTECS.g:2256:2: rule__Cloud__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_8__1"


    // $ANTLR start "rule__Cloud__Group_8__1__Impl"
    // InternalIoTECS.g:2262:1: rule__Cloud__Group_8__1__Impl : ( ( rule__Cloud__NetworkAdapterAssignment_8_1 ) ) ;
    public final void rule__Cloud__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2266:1: ( ( ( rule__Cloud__NetworkAdapterAssignment_8_1 ) ) )
            // InternalIoTECS.g:2267:1: ( ( rule__Cloud__NetworkAdapterAssignment_8_1 ) )
            {
            // InternalIoTECS.g:2267:1: ( ( rule__Cloud__NetworkAdapterAssignment_8_1 ) )
            // InternalIoTECS.g:2268:2: ( rule__Cloud__NetworkAdapterAssignment_8_1 )
            {
             before(grammarAccess.getCloudAccess().getNetworkAdapterAssignment_8_1()); 
            // InternalIoTECS.g:2269:2: ( rule__Cloud__NetworkAdapterAssignment_8_1 )
            // InternalIoTECS.g:2269:3: rule__Cloud__NetworkAdapterAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Cloud__NetworkAdapterAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCloudAccess().getNetworkAdapterAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group_8__1__Impl"


    // $ANTLR start "rule__SimulationNode__Group__0"
    // InternalIoTECS.g:2278:1: rule__SimulationNode__Group__0 : rule__SimulationNode__Group__0__Impl rule__SimulationNode__Group__1 ;
    public final void rule__SimulationNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2282:1: ( rule__SimulationNode__Group__0__Impl rule__SimulationNode__Group__1 )
            // InternalIoTECS.g:2283:2: rule__SimulationNode__Group__0__Impl rule__SimulationNode__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SimulationNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__0"


    // $ANTLR start "rule__SimulationNode__Group__0__Impl"
    // InternalIoTECS.g:2290:1: rule__SimulationNode__Group__0__Impl : ( 'SimulationNode:' ) ;
    public final void rule__SimulationNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2294:1: ( ( 'SimulationNode:' ) )
            // InternalIoTECS.g:2295:1: ( 'SimulationNode:' )
            {
            // InternalIoTECS.g:2295:1: ( 'SimulationNode:' )
            // InternalIoTECS.g:2296:2: 'SimulationNode:'
            {
             before(grammarAccess.getSimulationNodeAccess().getSimulationNodeKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getSimulationNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__0__Impl"


    // $ANTLR start "rule__SimulationNode__Group__1"
    // InternalIoTECS.g:2305:1: rule__SimulationNode__Group__1 : rule__SimulationNode__Group__1__Impl rule__SimulationNode__Group__2 ;
    public final void rule__SimulationNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2309:1: ( rule__SimulationNode__Group__1__Impl rule__SimulationNode__Group__2 )
            // InternalIoTECS.g:2310:2: rule__SimulationNode__Group__1__Impl rule__SimulationNode__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SimulationNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__1"


    // $ANTLR start "rule__SimulationNode__Group__1__Impl"
    // InternalIoTECS.g:2317:1: rule__SimulationNode__Group__1__Impl : ( ( rule__SimulationNode__NameAssignment_1 ) ) ;
    public final void rule__SimulationNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2321:1: ( ( ( rule__SimulationNode__NameAssignment_1 ) ) )
            // InternalIoTECS.g:2322:1: ( ( rule__SimulationNode__NameAssignment_1 ) )
            {
            // InternalIoTECS.g:2322:1: ( ( rule__SimulationNode__NameAssignment_1 ) )
            // InternalIoTECS.g:2323:2: ( rule__SimulationNode__NameAssignment_1 )
            {
             before(grammarAccess.getSimulationNodeAccess().getNameAssignment_1()); 
            // InternalIoTECS.g:2324:2: ( rule__SimulationNode__NameAssignment_1 )
            // InternalIoTECS.g:2324:3: rule__SimulationNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimulationNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__1__Impl"


    // $ANTLR start "rule__SimulationNode__Group__2"
    // InternalIoTECS.g:2332:1: rule__SimulationNode__Group__2 : rule__SimulationNode__Group__2__Impl rule__SimulationNode__Group__3 ;
    public final void rule__SimulationNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2336:1: ( rule__SimulationNode__Group__2__Impl rule__SimulationNode__Group__3 )
            // InternalIoTECS.g:2337:2: rule__SimulationNode__Group__2__Impl rule__SimulationNode__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__SimulationNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__2"


    // $ANTLR start "rule__SimulationNode__Group__2__Impl"
    // InternalIoTECS.g:2344:1: rule__SimulationNode__Group__2__Impl : ( '{' ) ;
    public final void rule__SimulationNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2348:1: ( ( '{' ) )
            // InternalIoTECS.g:2349:1: ( '{' )
            {
            // InternalIoTECS.g:2349:1: ( '{' )
            // InternalIoTECS.g:2350:2: '{'
            {
             before(grammarAccess.getSimulationNodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__2__Impl"


    // $ANTLR start "rule__SimulationNode__Group__3"
    // InternalIoTECS.g:2359:1: rule__SimulationNode__Group__3 : rule__SimulationNode__Group__3__Impl rule__SimulationNode__Group__4 ;
    public final void rule__SimulationNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2363:1: ( rule__SimulationNode__Group__3__Impl rule__SimulationNode__Group__4 )
            // InternalIoTECS.g:2364:2: rule__SimulationNode__Group__3__Impl rule__SimulationNode__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SimulationNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__3"


    // $ANTLR start "rule__SimulationNode__Group__3__Impl"
    // InternalIoTECS.g:2371:1: rule__SimulationNode__Group__3__Impl : ( 'platform:' ) ;
    public final void rule__SimulationNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2375:1: ( ( 'platform:' ) )
            // InternalIoTECS.g:2376:1: ( 'platform:' )
            {
            // InternalIoTECS.g:2376:1: ( 'platform:' )
            // InternalIoTECS.g:2377:2: 'platform:'
            {
             before(grammarAccess.getSimulationNodeAccess().getPlatformKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getPlatformKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__3__Impl"


    // $ANTLR start "rule__SimulationNode__Group__4"
    // InternalIoTECS.g:2386:1: rule__SimulationNode__Group__4 : rule__SimulationNode__Group__4__Impl rule__SimulationNode__Group__5 ;
    public final void rule__SimulationNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2390:1: ( rule__SimulationNode__Group__4__Impl rule__SimulationNode__Group__5 )
            // InternalIoTECS.g:2391:2: rule__SimulationNode__Group__4__Impl rule__SimulationNode__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__SimulationNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__4"


    // $ANTLR start "rule__SimulationNode__Group__4__Impl"
    // InternalIoTECS.g:2398:1: rule__SimulationNode__Group__4__Impl : ( ( rule__SimulationNode__PlatformAssignment_4 ) ) ;
    public final void rule__SimulationNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2402:1: ( ( ( rule__SimulationNode__PlatformAssignment_4 ) ) )
            // InternalIoTECS.g:2403:1: ( ( rule__SimulationNode__PlatformAssignment_4 ) )
            {
            // InternalIoTECS.g:2403:1: ( ( rule__SimulationNode__PlatformAssignment_4 ) )
            // InternalIoTECS.g:2404:2: ( rule__SimulationNode__PlatformAssignment_4 )
            {
             before(grammarAccess.getSimulationNodeAccess().getPlatformAssignment_4()); 
            // InternalIoTECS.g:2405:2: ( rule__SimulationNode__PlatformAssignment_4 )
            // InternalIoTECS.g:2405:3: rule__SimulationNode__PlatformAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNode__PlatformAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimulationNodeAccess().getPlatformAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__4__Impl"


    // $ANTLR start "rule__SimulationNode__Group__5"
    // InternalIoTECS.g:2413:1: rule__SimulationNode__Group__5 : rule__SimulationNode__Group__5__Impl rule__SimulationNode__Group__6 ;
    public final void rule__SimulationNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2417:1: ( rule__SimulationNode__Group__5__Impl rule__SimulationNode__Group__6 )
            // InternalIoTECS.g:2418:2: rule__SimulationNode__Group__5__Impl rule__SimulationNode__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__SimulationNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__5"


    // $ANTLR start "rule__SimulationNode__Group__5__Impl"
    // InternalIoTECS.g:2425:1: rule__SimulationNode__Group__5__Impl : ( 'EdgeDevices:' ) ;
    public final void rule__SimulationNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2429:1: ( ( 'EdgeDevices:' ) )
            // InternalIoTECS.g:2430:1: ( 'EdgeDevices:' )
            {
            // InternalIoTECS.g:2430:1: ( 'EdgeDevices:' )
            // InternalIoTECS.g:2431:2: 'EdgeDevices:'
            {
             before(grammarAccess.getSimulationNodeAccess().getEdgeDevicesKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getEdgeDevicesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__5__Impl"


    // $ANTLR start "rule__SimulationNode__Group__6"
    // InternalIoTECS.g:2440:1: rule__SimulationNode__Group__6 : rule__SimulationNode__Group__6__Impl rule__SimulationNode__Group__7 ;
    public final void rule__SimulationNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2444:1: ( rule__SimulationNode__Group__6__Impl rule__SimulationNode__Group__7 )
            // InternalIoTECS.g:2445:2: rule__SimulationNode__Group__6__Impl rule__SimulationNode__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__SimulationNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__6"


    // $ANTLR start "rule__SimulationNode__Group__6__Impl"
    // InternalIoTECS.g:2452:1: rule__SimulationNode__Group__6__Impl : ( '{' ) ;
    public final void rule__SimulationNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2456:1: ( ( '{' ) )
            // InternalIoTECS.g:2457:1: ( '{' )
            {
            // InternalIoTECS.g:2457:1: ( '{' )
            // InternalIoTECS.g:2458:2: '{'
            {
             before(grammarAccess.getSimulationNodeAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__6__Impl"


    // $ANTLR start "rule__SimulationNode__Group__7"
    // InternalIoTECS.g:2467:1: rule__SimulationNode__Group__7 : rule__SimulationNode__Group__7__Impl rule__SimulationNode__Group__8 ;
    public final void rule__SimulationNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2471:1: ( rule__SimulationNode__Group__7__Impl rule__SimulationNode__Group__8 )
            // InternalIoTECS.g:2472:2: rule__SimulationNode__Group__7__Impl rule__SimulationNode__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__SimulationNode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__7"


    // $ANTLR start "rule__SimulationNode__Group__7__Impl"
    // InternalIoTECS.g:2479:1: rule__SimulationNode__Group__7__Impl : ( ( rule__SimulationNode__EdgeDevicesAssignment_7 )* ) ;
    public final void rule__SimulationNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2483:1: ( ( ( rule__SimulationNode__EdgeDevicesAssignment_7 )* ) )
            // InternalIoTECS.g:2484:1: ( ( rule__SimulationNode__EdgeDevicesAssignment_7 )* )
            {
            // InternalIoTECS.g:2484:1: ( ( rule__SimulationNode__EdgeDevicesAssignment_7 )* )
            // InternalIoTECS.g:2485:2: ( rule__SimulationNode__EdgeDevicesAssignment_7 )*
            {
             before(grammarAccess.getSimulationNodeAccess().getEdgeDevicesAssignment_7()); 
            // InternalIoTECS.g:2486:2: ( rule__SimulationNode__EdgeDevicesAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoTECS.g:2486:3: rule__SimulationNode__EdgeDevicesAssignment_7
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SimulationNode__EdgeDevicesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSimulationNodeAccess().getEdgeDevicesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__7__Impl"


    // $ANTLR start "rule__SimulationNode__Group__8"
    // InternalIoTECS.g:2494:1: rule__SimulationNode__Group__8 : rule__SimulationNode__Group__8__Impl rule__SimulationNode__Group__9 ;
    public final void rule__SimulationNode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2498:1: ( rule__SimulationNode__Group__8__Impl rule__SimulationNode__Group__9 )
            // InternalIoTECS.g:2499:2: rule__SimulationNode__Group__8__Impl rule__SimulationNode__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__SimulationNode__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__8"


    // $ANTLR start "rule__SimulationNode__Group__8__Impl"
    // InternalIoTECS.g:2506:1: rule__SimulationNode__Group__8__Impl : ( '}' ) ;
    public final void rule__SimulationNode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2510:1: ( ( '}' ) )
            // InternalIoTECS.g:2511:1: ( '}' )
            {
            // InternalIoTECS.g:2511:1: ( '}' )
            // InternalIoTECS.g:2512:2: '}'
            {
             before(grammarAccess.getSimulationNodeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__8__Impl"


    // $ANTLR start "rule__SimulationNode__Group__9"
    // InternalIoTECS.g:2521:1: rule__SimulationNode__Group__9 : rule__SimulationNode__Group__9__Impl ;
    public final void rule__SimulationNode__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2525:1: ( rule__SimulationNode__Group__9__Impl )
            // InternalIoTECS.g:2526:2: rule__SimulationNode__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNode__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__9"


    // $ANTLR start "rule__SimulationNode__Group__9__Impl"
    // InternalIoTECS.g:2532:1: rule__SimulationNode__Group__9__Impl : ( '}' ) ;
    public final void rule__SimulationNode__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2536:1: ( ( '}' ) )
            // InternalIoTECS.g:2537:1: ( '}' )
            {
            // InternalIoTECS.g:2537:1: ( '}' )
            // InternalIoTECS.g:2538:2: '}'
            {
             before(grammarAccess.getSimulationNodeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__Group__9__Impl"


    // $ANTLR start "rule__SimulationNodes__Group__0"
    // InternalIoTECS.g:2548:1: rule__SimulationNodes__Group__0 : rule__SimulationNodes__Group__0__Impl rule__SimulationNodes__Group__1 ;
    public final void rule__SimulationNodes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2552:1: ( rule__SimulationNodes__Group__0__Impl rule__SimulationNodes__Group__1 )
            // InternalIoTECS.g:2553:2: rule__SimulationNodes__Group__0__Impl rule__SimulationNodes__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__SimulationNodes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNodes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__0"


    // $ANTLR start "rule__SimulationNodes__Group__0__Impl"
    // InternalIoTECS.g:2560:1: rule__SimulationNodes__Group__0__Impl : ( ( rule__SimulationNodes__SnAssignment_0 ) ) ;
    public final void rule__SimulationNodes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2564:1: ( ( ( rule__SimulationNodes__SnAssignment_0 ) ) )
            // InternalIoTECS.g:2565:1: ( ( rule__SimulationNodes__SnAssignment_0 ) )
            {
            // InternalIoTECS.g:2565:1: ( ( rule__SimulationNodes__SnAssignment_0 ) )
            // InternalIoTECS.g:2566:2: ( rule__SimulationNodes__SnAssignment_0 )
            {
             before(grammarAccess.getSimulationNodesAccess().getSnAssignment_0()); 
            // InternalIoTECS.g:2567:2: ( rule__SimulationNodes__SnAssignment_0 )
            // InternalIoTECS.g:2567:3: rule__SimulationNodes__SnAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNodes__SnAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimulationNodesAccess().getSnAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__0__Impl"


    // $ANTLR start "rule__SimulationNodes__Group__1"
    // InternalIoTECS.g:2575:1: rule__SimulationNodes__Group__1 : rule__SimulationNodes__Group__1__Impl rule__SimulationNodes__Group__2 ;
    public final void rule__SimulationNodes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2579:1: ( rule__SimulationNodes__Group__1__Impl rule__SimulationNodes__Group__2 )
            // InternalIoTECS.g:2580:2: rule__SimulationNodes__Group__1__Impl rule__SimulationNodes__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SimulationNodes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNodes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__1"


    // $ANTLR start "rule__SimulationNodes__Group__1__Impl"
    // InternalIoTECS.g:2587:1: rule__SimulationNodes__Group__1__Impl : ( '[' ) ;
    public final void rule__SimulationNodes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2591:1: ( ( '[' ) )
            // InternalIoTECS.g:2592:1: ( '[' )
            {
            // InternalIoTECS.g:2592:1: ( '[' )
            // InternalIoTECS.g:2593:2: '['
            {
             before(grammarAccess.getSimulationNodesAccess().getLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSimulationNodesAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__1__Impl"


    // $ANTLR start "rule__SimulationNodes__Group__2"
    // InternalIoTECS.g:2602:1: rule__SimulationNodes__Group__2 : rule__SimulationNodes__Group__2__Impl rule__SimulationNodes__Group__3 ;
    public final void rule__SimulationNodes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2606:1: ( rule__SimulationNodes__Group__2__Impl rule__SimulationNodes__Group__3 )
            // InternalIoTECS.g:2607:2: rule__SimulationNodes__Group__2__Impl rule__SimulationNodes__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SimulationNodes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNodes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__2"


    // $ANTLR start "rule__SimulationNodes__Group__2__Impl"
    // InternalIoTECS.g:2614:1: rule__SimulationNodes__Group__2__Impl : ( ( rule__SimulationNodes__NAssignment_2 ) ) ;
    public final void rule__SimulationNodes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2618:1: ( ( ( rule__SimulationNodes__NAssignment_2 ) ) )
            // InternalIoTECS.g:2619:1: ( ( rule__SimulationNodes__NAssignment_2 ) )
            {
            // InternalIoTECS.g:2619:1: ( ( rule__SimulationNodes__NAssignment_2 ) )
            // InternalIoTECS.g:2620:2: ( rule__SimulationNodes__NAssignment_2 )
            {
             before(grammarAccess.getSimulationNodesAccess().getNAssignment_2()); 
            // InternalIoTECS.g:2621:2: ( rule__SimulationNodes__NAssignment_2 )
            // InternalIoTECS.g:2621:3: rule__SimulationNodes__NAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNodes__NAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimulationNodesAccess().getNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__2__Impl"


    // $ANTLR start "rule__SimulationNodes__Group__3"
    // InternalIoTECS.g:2629:1: rule__SimulationNodes__Group__3 : rule__SimulationNodes__Group__3__Impl rule__SimulationNodes__Group__4 ;
    public final void rule__SimulationNodes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2633:1: ( rule__SimulationNodes__Group__3__Impl rule__SimulationNodes__Group__4 )
            // InternalIoTECS.g:2634:2: rule__SimulationNodes__Group__3__Impl rule__SimulationNodes__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__SimulationNodes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimulationNodes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__3"


    // $ANTLR start "rule__SimulationNodes__Group__3__Impl"
    // InternalIoTECS.g:2641:1: rule__SimulationNodes__Group__3__Impl : ( ']' ) ;
    public final void rule__SimulationNodes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2645:1: ( ( ']' ) )
            // InternalIoTECS.g:2646:1: ( ']' )
            {
            // InternalIoTECS.g:2646:1: ( ']' )
            // InternalIoTECS.g:2647:2: ']'
            {
             before(grammarAccess.getSimulationNodesAccess().getRightSquareBracketKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSimulationNodesAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__3__Impl"


    // $ANTLR start "rule__SimulationNodes__Group__4"
    // InternalIoTECS.g:2656:1: rule__SimulationNodes__Group__4 : rule__SimulationNodes__Group__4__Impl ;
    public final void rule__SimulationNodes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2660:1: ( rule__SimulationNodes__Group__4__Impl )
            // InternalIoTECS.g:2661:2: rule__SimulationNodes__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimulationNodes__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__4"


    // $ANTLR start "rule__SimulationNodes__Group__4__Impl"
    // InternalIoTECS.g:2667:1: rule__SimulationNodes__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__SimulationNodes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2671:1: ( ( ( ',' )? ) )
            // InternalIoTECS.g:2672:1: ( ( ',' )? )
            {
            // InternalIoTECS.g:2672:1: ( ( ',' )? )
            // InternalIoTECS.g:2673:2: ( ',' )?
            {
             before(grammarAccess.getSimulationNodesAccess().getCommaKeyword_4()); 
            // InternalIoTECS.g:2674:2: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTECS.g:2674:3: ','
                    {
                    match(input,52,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSimulationNodesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__Group__4__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__0"
    // InternalIoTECS.g:2683:1: rule__EdgeDevice__Group__0 : rule__EdgeDevice__Group__0__Impl rule__EdgeDevice__Group__1 ;
    public final void rule__EdgeDevice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2687:1: ( rule__EdgeDevice__Group__0__Impl rule__EdgeDevice__Group__1 )
            // InternalIoTECS.g:2688:2: rule__EdgeDevice__Group__0__Impl rule__EdgeDevice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EdgeDevice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__0"


    // $ANTLR start "rule__EdgeDevice__Group__0__Impl"
    // InternalIoTECS.g:2695:1: rule__EdgeDevice__Group__0__Impl : ( 'EdgeDevice:' ) ;
    public final void rule__EdgeDevice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2699:1: ( ( 'EdgeDevice:' ) )
            // InternalIoTECS.g:2700:1: ( 'EdgeDevice:' )
            {
            // InternalIoTECS.g:2700:1: ( 'EdgeDevice:' )
            // InternalIoTECS.g:2701:2: 'EdgeDevice:'
            {
             before(grammarAccess.getEdgeDeviceAccess().getEdgeDeviceKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getEdgeDeviceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__0__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__1"
    // InternalIoTECS.g:2710:1: rule__EdgeDevice__Group__1 : rule__EdgeDevice__Group__1__Impl rule__EdgeDevice__Group__2 ;
    public final void rule__EdgeDevice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2714:1: ( rule__EdgeDevice__Group__1__Impl rule__EdgeDevice__Group__2 )
            // InternalIoTECS.g:2715:2: rule__EdgeDevice__Group__1__Impl rule__EdgeDevice__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EdgeDevice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__1"


    // $ANTLR start "rule__EdgeDevice__Group__1__Impl"
    // InternalIoTECS.g:2722:1: rule__EdgeDevice__Group__1__Impl : ( ( rule__EdgeDevice__NameAssignment_1 ) ) ;
    public final void rule__EdgeDevice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2726:1: ( ( ( rule__EdgeDevice__NameAssignment_1 ) ) )
            // InternalIoTECS.g:2727:1: ( ( rule__EdgeDevice__NameAssignment_1 ) )
            {
            // InternalIoTECS.g:2727:1: ( ( rule__EdgeDevice__NameAssignment_1 ) )
            // InternalIoTECS.g:2728:2: ( rule__EdgeDevice__NameAssignment_1 )
            {
             before(grammarAccess.getEdgeDeviceAccess().getNameAssignment_1()); 
            // InternalIoTECS.g:2729:2: ( rule__EdgeDevice__NameAssignment_1 )
            // InternalIoTECS.g:2729:3: rule__EdgeDevice__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDeviceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__1__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__2"
    // InternalIoTECS.g:2737:1: rule__EdgeDevice__Group__2 : rule__EdgeDevice__Group__2__Impl rule__EdgeDevice__Group__3 ;
    public final void rule__EdgeDevice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2741:1: ( rule__EdgeDevice__Group__2__Impl rule__EdgeDevice__Group__3 )
            // InternalIoTECS.g:2742:2: rule__EdgeDevice__Group__2__Impl rule__EdgeDevice__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__EdgeDevice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__2"


    // $ANTLR start "rule__EdgeDevice__Group__2__Impl"
    // InternalIoTECS.g:2749:1: rule__EdgeDevice__Group__2__Impl : ( '{' ) ;
    public final void rule__EdgeDevice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2753:1: ( ( '{' ) )
            // InternalIoTECS.g:2754:1: ( '{' )
            {
            // InternalIoTECS.g:2754:1: ( '{' )
            // InternalIoTECS.g:2755:2: '{'
            {
             before(grammarAccess.getEdgeDeviceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__2__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__3"
    // InternalIoTECS.g:2764:1: rule__EdgeDevice__Group__3 : rule__EdgeDevice__Group__3__Impl rule__EdgeDevice__Group__4 ;
    public final void rule__EdgeDevice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2768:1: ( rule__EdgeDevice__Group__3__Impl rule__EdgeDevice__Group__4 )
            // InternalIoTECS.g:2769:2: rule__EdgeDevice__Group__3__Impl rule__EdgeDevice__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__EdgeDevice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__3"


    // $ANTLR start "rule__EdgeDevice__Group__3__Impl"
    // InternalIoTECS.g:2776:1: rule__EdgeDevice__Group__3__Impl : ( 'protocol:' ) ;
    public final void rule__EdgeDevice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2780:1: ( ( 'protocol:' ) )
            // InternalIoTECS.g:2781:1: ( 'protocol:' )
            {
            // InternalIoTECS.g:2781:1: ( 'protocol:' )
            // InternalIoTECS.g:2782:2: 'protocol:'
            {
             before(grammarAccess.getEdgeDeviceAccess().getProtocolKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getProtocolKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__3__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__4"
    // InternalIoTECS.g:2791:1: rule__EdgeDevice__Group__4 : rule__EdgeDevice__Group__4__Impl rule__EdgeDevice__Group__5 ;
    public final void rule__EdgeDevice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2795:1: ( rule__EdgeDevice__Group__4__Impl rule__EdgeDevice__Group__5 )
            // InternalIoTECS.g:2796:2: rule__EdgeDevice__Group__4__Impl rule__EdgeDevice__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__EdgeDevice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__4"


    // $ANTLR start "rule__EdgeDevice__Group__4__Impl"
    // InternalIoTECS.g:2803:1: rule__EdgeDevice__Group__4__Impl : ( ( rule__EdgeDevice__ProtocolAssignment_4 ) ) ;
    public final void rule__EdgeDevice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2807:1: ( ( ( rule__EdgeDevice__ProtocolAssignment_4 ) ) )
            // InternalIoTECS.g:2808:1: ( ( rule__EdgeDevice__ProtocolAssignment_4 ) )
            {
            // InternalIoTECS.g:2808:1: ( ( rule__EdgeDevice__ProtocolAssignment_4 ) )
            // InternalIoTECS.g:2809:2: ( rule__EdgeDevice__ProtocolAssignment_4 )
            {
             before(grammarAccess.getEdgeDeviceAccess().getProtocolAssignment_4()); 
            // InternalIoTECS.g:2810:2: ( rule__EdgeDevice__ProtocolAssignment_4 )
            // InternalIoTECS.g:2810:3: rule__EdgeDevice__ProtocolAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__ProtocolAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDeviceAccess().getProtocolAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__4__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__5"
    // InternalIoTECS.g:2818:1: rule__EdgeDevice__Group__5 : rule__EdgeDevice__Group__5__Impl rule__EdgeDevice__Group__6 ;
    public final void rule__EdgeDevice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2822:1: ( rule__EdgeDevice__Group__5__Impl rule__EdgeDevice__Group__6 )
            // InternalIoTECS.g:2823:2: rule__EdgeDevice__Group__5__Impl rule__EdgeDevice__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__EdgeDevice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__5"


    // $ANTLR start "rule__EdgeDevice__Group__5__Impl"
    // InternalIoTECS.g:2830:1: rule__EdgeDevice__Group__5__Impl : ( 'speed:' ) ;
    public final void rule__EdgeDevice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2834:1: ( ( 'speed:' ) )
            // InternalIoTECS.g:2835:1: ( 'speed:' )
            {
            // InternalIoTECS.g:2835:1: ( 'speed:' )
            // InternalIoTECS.g:2836:2: 'speed:'
            {
             before(grammarAccess.getEdgeDeviceAccess().getSpeedKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getSpeedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__5__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__6"
    // InternalIoTECS.g:2845:1: rule__EdgeDevice__Group__6 : rule__EdgeDevice__Group__6__Impl rule__EdgeDevice__Group__7 ;
    public final void rule__EdgeDevice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2849:1: ( rule__EdgeDevice__Group__6__Impl rule__EdgeDevice__Group__7 )
            // InternalIoTECS.g:2850:2: rule__EdgeDevice__Group__6__Impl rule__EdgeDevice__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__EdgeDevice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__6"


    // $ANTLR start "rule__EdgeDevice__Group__6__Impl"
    // InternalIoTECS.g:2857:1: rule__EdgeDevice__Group__6__Impl : ( ( rule__EdgeDevice__SpeedAssignment_6 ) ) ;
    public final void rule__EdgeDevice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2861:1: ( ( ( rule__EdgeDevice__SpeedAssignment_6 ) ) )
            // InternalIoTECS.g:2862:1: ( ( rule__EdgeDevice__SpeedAssignment_6 ) )
            {
            // InternalIoTECS.g:2862:1: ( ( rule__EdgeDevice__SpeedAssignment_6 ) )
            // InternalIoTECS.g:2863:2: ( rule__EdgeDevice__SpeedAssignment_6 )
            {
             before(grammarAccess.getEdgeDeviceAccess().getSpeedAssignment_6()); 
            // InternalIoTECS.g:2864:2: ( rule__EdgeDevice__SpeedAssignment_6 )
            // InternalIoTECS.g:2864:3: rule__EdgeDevice__SpeedAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__SpeedAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDeviceAccess().getSpeedAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__6__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__7"
    // InternalIoTECS.g:2872:1: rule__EdgeDevice__Group__7 : rule__EdgeDevice__Group__7__Impl rule__EdgeDevice__Group__8 ;
    public final void rule__EdgeDevice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2876:1: ( rule__EdgeDevice__Group__7__Impl rule__EdgeDevice__Group__8 )
            // InternalIoTECS.g:2877:2: rule__EdgeDevice__Group__7__Impl rule__EdgeDevice__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__EdgeDevice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__7"


    // $ANTLR start "rule__EdgeDevice__Group__7__Impl"
    // InternalIoTECS.g:2884:1: rule__EdgeDevice__Group__7__Impl : ( 'cloud:' ) ;
    public final void rule__EdgeDevice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2888:1: ( ( 'cloud:' ) )
            // InternalIoTECS.g:2889:1: ( 'cloud:' )
            {
            // InternalIoTECS.g:2889:1: ( 'cloud:' )
            // InternalIoTECS.g:2890:2: 'cloud:'
            {
             before(grammarAccess.getEdgeDeviceAccess().getCloudKeyword_7()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getCloudKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__7__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__8"
    // InternalIoTECS.g:2899:1: rule__EdgeDevice__Group__8 : rule__EdgeDevice__Group__8__Impl rule__EdgeDevice__Group__9 ;
    public final void rule__EdgeDevice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2903:1: ( rule__EdgeDevice__Group__8__Impl rule__EdgeDevice__Group__9 )
            // InternalIoTECS.g:2904:2: rule__EdgeDevice__Group__8__Impl rule__EdgeDevice__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__EdgeDevice__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__8"


    // $ANTLR start "rule__EdgeDevice__Group__8__Impl"
    // InternalIoTECS.g:2911:1: rule__EdgeDevice__Group__8__Impl : ( ( rule__EdgeDevice__CloudAssignment_8 ) ) ;
    public final void rule__EdgeDevice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2915:1: ( ( ( rule__EdgeDevice__CloudAssignment_8 ) ) )
            // InternalIoTECS.g:2916:1: ( ( rule__EdgeDevice__CloudAssignment_8 ) )
            {
            // InternalIoTECS.g:2916:1: ( ( rule__EdgeDevice__CloudAssignment_8 ) )
            // InternalIoTECS.g:2917:2: ( rule__EdgeDevice__CloudAssignment_8 )
            {
             before(grammarAccess.getEdgeDeviceAccess().getCloudAssignment_8()); 
            // InternalIoTECS.g:2918:2: ( rule__EdgeDevice__CloudAssignment_8 )
            // InternalIoTECS.g:2918:3: rule__EdgeDevice__CloudAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__CloudAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDeviceAccess().getCloudAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__8__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__9"
    // InternalIoTECS.g:2926:1: rule__EdgeDevice__Group__9 : rule__EdgeDevice__Group__9__Impl rule__EdgeDevice__Group__10 ;
    public final void rule__EdgeDevice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2930:1: ( rule__EdgeDevice__Group__9__Impl rule__EdgeDevice__Group__10 )
            // InternalIoTECS.g:2931:2: rule__EdgeDevice__Group__9__Impl rule__EdgeDevice__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__EdgeDevice__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__9"


    // $ANTLR start "rule__EdgeDevice__Group__9__Impl"
    // InternalIoTECS.g:2938:1: rule__EdgeDevice__Group__9__Impl : ( 'workload:' ) ;
    public final void rule__EdgeDevice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2942:1: ( ( 'workload:' ) )
            // InternalIoTECS.g:2943:1: ( 'workload:' )
            {
            // InternalIoTECS.g:2943:1: ( 'workload:' )
            // InternalIoTECS.g:2944:2: 'workload:'
            {
             before(grammarAccess.getEdgeDeviceAccess().getWorkloadKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getWorkloadKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__9__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__10"
    // InternalIoTECS.g:2953:1: rule__EdgeDevice__Group__10 : rule__EdgeDevice__Group__10__Impl rule__EdgeDevice__Group__11 ;
    public final void rule__EdgeDevice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2957:1: ( rule__EdgeDevice__Group__10__Impl rule__EdgeDevice__Group__11 )
            // InternalIoTECS.g:2958:2: rule__EdgeDevice__Group__10__Impl rule__EdgeDevice__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__EdgeDevice__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__10"


    // $ANTLR start "rule__EdgeDevice__Group__10__Impl"
    // InternalIoTECS.g:2965:1: rule__EdgeDevice__Group__10__Impl : ( ( rule__EdgeDevice__WorkloadAssignment_10 ) ) ;
    public final void rule__EdgeDevice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2969:1: ( ( ( rule__EdgeDevice__WorkloadAssignment_10 ) ) )
            // InternalIoTECS.g:2970:1: ( ( rule__EdgeDevice__WorkloadAssignment_10 ) )
            {
            // InternalIoTECS.g:2970:1: ( ( rule__EdgeDevice__WorkloadAssignment_10 ) )
            // InternalIoTECS.g:2971:2: ( rule__EdgeDevice__WorkloadAssignment_10 )
            {
             before(grammarAccess.getEdgeDeviceAccess().getWorkloadAssignment_10()); 
            // InternalIoTECS.g:2972:2: ( rule__EdgeDevice__WorkloadAssignment_10 )
            // InternalIoTECS.g:2972:3: rule__EdgeDevice__WorkloadAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__WorkloadAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDeviceAccess().getWorkloadAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__10__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__11"
    // InternalIoTECS.g:2980:1: rule__EdgeDevice__Group__11 : rule__EdgeDevice__Group__11__Impl rule__EdgeDevice__Group__12 ;
    public final void rule__EdgeDevice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2984:1: ( rule__EdgeDevice__Group__11__Impl rule__EdgeDevice__Group__12 )
            // InternalIoTECS.g:2985:2: rule__EdgeDevice__Group__11__Impl rule__EdgeDevice__Group__12
            {
            pushFollow(FOLLOW_40);
            rule__EdgeDevice__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__11"


    // $ANTLR start "rule__EdgeDevice__Group__11__Impl"
    // InternalIoTECS.g:2992:1: rule__EdgeDevice__Group__11__Impl : ( ( rule__EdgeDevice__WorkloadUnitAssignment_11 ) ) ;
    public final void rule__EdgeDevice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:2996:1: ( ( ( rule__EdgeDevice__WorkloadUnitAssignment_11 ) ) )
            // InternalIoTECS.g:2997:1: ( ( rule__EdgeDevice__WorkloadUnitAssignment_11 ) )
            {
            // InternalIoTECS.g:2997:1: ( ( rule__EdgeDevice__WorkloadUnitAssignment_11 ) )
            // InternalIoTECS.g:2998:2: ( rule__EdgeDevice__WorkloadUnitAssignment_11 )
            {
             before(grammarAccess.getEdgeDeviceAccess().getWorkloadUnitAssignment_11()); 
            // InternalIoTECS.g:2999:2: ( rule__EdgeDevice__WorkloadUnitAssignment_11 )
            // InternalIoTECS.g:2999:3: rule__EdgeDevice__WorkloadUnitAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__WorkloadUnitAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDeviceAccess().getWorkloadUnitAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__11__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__12"
    // InternalIoTECS.g:3007:1: rule__EdgeDevice__Group__12 : rule__EdgeDevice__Group__12__Impl rule__EdgeDevice__Group__13 ;
    public final void rule__EdgeDevice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3011:1: ( rule__EdgeDevice__Group__12__Impl rule__EdgeDevice__Group__13 )
            // InternalIoTECS.g:3012:2: rule__EdgeDevice__Group__12__Impl rule__EdgeDevice__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__EdgeDevice__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__12"


    // $ANTLR start "rule__EdgeDevice__Group__12__Impl"
    // InternalIoTECS.g:3019:1: rule__EdgeDevice__Group__12__Impl : ( 'devices:' ) ;
    public final void rule__EdgeDevice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3023:1: ( ( 'devices:' ) )
            // InternalIoTECS.g:3024:1: ( 'devices:' )
            {
            // InternalIoTECS.g:3024:1: ( 'devices:' )
            // InternalIoTECS.g:3025:2: 'devices:'
            {
             before(grammarAccess.getEdgeDeviceAccess().getDevicesKeyword_12()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getDevicesKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__12__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__13"
    // InternalIoTECS.g:3034:1: rule__EdgeDevice__Group__13 : rule__EdgeDevice__Group__13__Impl rule__EdgeDevice__Group__14 ;
    public final void rule__EdgeDevice__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3038:1: ( rule__EdgeDevice__Group__13__Impl rule__EdgeDevice__Group__14 )
            // InternalIoTECS.g:3039:2: rule__EdgeDevice__Group__13__Impl rule__EdgeDevice__Group__14
            {
            pushFollow(FOLLOW_22);
            rule__EdgeDevice__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__13"


    // $ANTLR start "rule__EdgeDevice__Group__13__Impl"
    // InternalIoTECS.g:3046:1: rule__EdgeDevice__Group__13__Impl : ( '{' ) ;
    public final void rule__EdgeDevice__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3050:1: ( ( '{' ) )
            // InternalIoTECS.g:3051:1: ( '{' )
            {
            // InternalIoTECS.g:3051:1: ( '{' )
            // InternalIoTECS.g:3052:2: '{'
            {
             before(grammarAccess.getEdgeDeviceAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__13__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__14"
    // InternalIoTECS.g:3061:1: rule__EdgeDevice__Group__14 : rule__EdgeDevice__Group__14__Impl rule__EdgeDevice__Group__15 ;
    public final void rule__EdgeDevice__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3065:1: ( rule__EdgeDevice__Group__14__Impl rule__EdgeDevice__Group__15 )
            // InternalIoTECS.g:3066:2: rule__EdgeDevice__Group__14__Impl rule__EdgeDevice__Group__15
            {
            pushFollow(FOLLOW_22);
            rule__EdgeDevice__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__14"


    // $ANTLR start "rule__EdgeDevice__Group__14__Impl"
    // InternalIoTECS.g:3073:1: rule__EdgeDevice__Group__14__Impl : ( ( rule__EdgeDevice__DevicesAssignment_14 )* ) ;
    public final void rule__EdgeDevice__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3077:1: ( ( ( rule__EdgeDevice__DevicesAssignment_14 )* ) )
            // InternalIoTECS.g:3078:1: ( ( rule__EdgeDevice__DevicesAssignment_14 )* )
            {
            // InternalIoTECS.g:3078:1: ( ( rule__EdgeDevice__DevicesAssignment_14 )* )
            // InternalIoTECS.g:3079:2: ( rule__EdgeDevice__DevicesAssignment_14 )*
            {
             before(grammarAccess.getEdgeDeviceAccess().getDevicesAssignment_14()); 
            // InternalIoTECS.g:3080:2: ( rule__EdgeDevice__DevicesAssignment_14 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIoTECS.g:3080:3: rule__EdgeDevice__DevicesAssignment_14
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__EdgeDevice__DevicesAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEdgeDeviceAccess().getDevicesAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__14__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__15"
    // InternalIoTECS.g:3088:1: rule__EdgeDevice__Group__15 : rule__EdgeDevice__Group__15__Impl rule__EdgeDevice__Group__16 ;
    public final void rule__EdgeDevice__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3092:1: ( rule__EdgeDevice__Group__15__Impl rule__EdgeDevice__Group__16 )
            // InternalIoTECS.g:3093:2: rule__EdgeDevice__Group__15__Impl rule__EdgeDevice__Group__16
            {
            pushFollow(FOLLOW_24);
            rule__EdgeDevice__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__15"


    // $ANTLR start "rule__EdgeDevice__Group__15__Impl"
    // InternalIoTECS.g:3100:1: rule__EdgeDevice__Group__15__Impl : ( '}' ) ;
    public final void rule__EdgeDevice__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3104:1: ( ( '}' ) )
            // InternalIoTECS.g:3105:1: ( '}' )
            {
            // InternalIoTECS.g:3105:1: ( '}' )
            // InternalIoTECS.g:3106:2: '}'
            {
             before(grammarAccess.getEdgeDeviceAccess().getRightCurlyBracketKeyword_15()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__15__Impl"


    // $ANTLR start "rule__EdgeDevice__Group__16"
    // InternalIoTECS.g:3115:1: rule__EdgeDevice__Group__16 : rule__EdgeDevice__Group__16__Impl ;
    public final void rule__EdgeDevice__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3119:1: ( rule__EdgeDevice__Group__16__Impl )
            // InternalIoTECS.g:3120:2: rule__EdgeDevice__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevice__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__16"


    // $ANTLR start "rule__EdgeDevice__Group__16__Impl"
    // InternalIoTECS.g:3126:1: rule__EdgeDevice__Group__16__Impl : ( '}' ) ;
    public final void rule__EdgeDevice__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3130:1: ( ( '}' ) )
            // InternalIoTECS.g:3131:1: ( '}' )
            {
            // InternalIoTECS.g:3131:1: ( '}' )
            // InternalIoTECS.g:3132:2: '}'
            {
             before(grammarAccess.getEdgeDeviceAccess().getRightCurlyBracketKeyword_16()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__Group__16__Impl"


    // $ANTLR start "rule__EdgeDevices__Group__0"
    // InternalIoTECS.g:3142:1: rule__EdgeDevices__Group__0 : rule__EdgeDevices__Group__0__Impl rule__EdgeDevices__Group__1 ;
    public final void rule__EdgeDevices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3146:1: ( rule__EdgeDevices__Group__0__Impl rule__EdgeDevices__Group__1 )
            // InternalIoTECS.g:3147:2: rule__EdgeDevices__Group__0__Impl rule__EdgeDevices__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EdgeDevices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__0"


    // $ANTLR start "rule__EdgeDevices__Group__0__Impl"
    // InternalIoTECS.g:3154:1: rule__EdgeDevices__Group__0__Impl : ( ( rule__EdgeDevices__SaAssignment_0 ) ) ;
    public final void rule__EdgeDevices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3158:1: ( ( ( rule__EdgeDevices__SaAssignment_0 ) ) )
            // InternalIoTECS.g:3159:1: ( ( rule__EdgeDevices__SaAssignment_0 ) )
            {
            // InternalIoTECS.g:3159:1: ( ( rule__EdgeDevices__SaAssignment_0 ) )
            // InternalIoTECS.g:3160:2: ( rule__EdgeDevices__SaAssignment_0 )
            {
             before(grammarAccess.getEdgeDevicesAccess().getSaAssignment_0()); 
            // InternalIoTECS.g:3161:2: ( rule__EdgeDevices__SaAssignment_0 )
            // InternalIoTECS.g:3161:3: rule__EdgeDevices__SaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevices__SaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDevicesAccess().getSaAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__0__Impl"


    // $ANTLR start "rule__EdgeDevices__Group__1"
    // InternalIoTECS.g:3169:1: rule__EdgeDevices__Group__1 : rule__EdgeDevices__Group__1__Impl rule__EdgeDevices__Group__2 ;
    public final void rule__EdgeDevices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3173:1: ( rule__EdgeDevices__Group__1__Impl rule__EdgeDevices__Group__2 )
            // InternalIoTECS.g:3174:2: rule__EdgeDevices__Group__1__Impl rule__EdgeDevices__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EdgeDevices__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevices__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__1"


    // $ANTLR start "rule__EdgeDevices__Group__1__Impl"
    // InternalIoTECS.g:3181:1: rule__EdgeDevices__Group__1__Impl : ( '[' ) ;
    public final void rule__EdgeDevices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3185:1: ( ( '[' ) )
            // InternalIoTECS.g:3186:1: ( '[' )
            {
            // InternalIoTECS.g:3186:1: ( '[' )
            // InternalIoTECS.g:3187:2: '['
            {
             before(grammarAccess.getEdgeDevicesAccess().getLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEdgeDevicesAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__1__Impl"


    // $ANTLR start "rule__EdgeDevices__Group__2"
    // InternalIoTECS.g:3196:1: rule__EdgeDevices__Group__2 : rule__EdgeDevices__Group__2__Impl rule__EdgeDevices__Group__3 ;
    public final void rule__EdgeDevices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3200:1: ( rule__EdgeDevices__Group__2__Impl rule__EdgeDevices__Group__3 )
            // InternalIoTECS.g:3201:2: rule__EdgeDevices__Group__2__Impl rule__EdgeDevices__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__EdgeDevices__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevices__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__2"


    // $ANTLR start "rule__EdgeDevices__Group__2__Impl"
    // InternalIoTECS.g:3208:1: rule__EdgeDevices__Group__2__Impl : ( ( rule__EdgeDevices__NAssignment_2 ) ) ;
    public final void rule__EdgeDevices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3212:1: ( ( ( rule__EdgeDevices__NAssignment_2 ) ) )
            // InternalIoTECS.g:3213:1: ( ( rule__EdgeDevices__NAssignment_2 ) )
            {
            // InternalIoTECS.g:3213:1: ( ( rule__EdgeDevices__NAssignment_2 ) )
            // InternalIoTECS.g:3214:2: ( rule__EdgeDevices__NAssignment_2 )
            {
             before(grammarAccess.getEdgeDevicesAccess().getNAssignment_2()); 
            // InternalIoTECS.g:3215:2: ( rule__EdgeDevices__NAssignment_2 )
            // InternalIoTECS.g:3215:3: rule__EdgeDevices__NAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevices__NAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeDevicesAccess().getNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__2__Impl"


    // $ANTLR start "rule__EdgeDevices__Group__3"
    // InternalIoTECS.g:3223:1: rule__EdgeDevices__Group__3 : rule__EdgeDevices__Group__3__Impl rule__EdgeDevices__Group__4 ;
    public final void rule__EdgeDevices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3227:1: ( rule__EdgeDevices__Group__3__Impl rule__EdgeDevices__Group__4 )
            // InternalIoTECS.g:3228:2: rule__EdgeDevices__Group__3__Impl rule__EdgeDevices__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__EdgeDevices__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EdgeDevices__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__3"


    // $ANTLR start "rule__EdgeDevices__Group__3__Impl"
    // InternalIoTECS.g:3235:1: rule__EdgeDevices__Group__3__Impl : ( ']' ) ;
    public final void rule__EdgeDevices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3239:1: ( ( ']' ) )
            // InternalIoTECS.g:3240:1: ( ']' )
            {
            // InternalIoTECS.g:3240:1: ( ']' )
            // InternalIoTECS.g:3241:2: ']'
            {
             before(grammarAccess.getEdgeDevicesAccess().getRightSquareBracketKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEdgeDevicesAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__3__Impl"


    // $ANTLR start "rule__EdgeDevices__Group__4"
    // InternalIoTECS.g:3250:1: rule__EdgeDevices__Group__4 : rule__EdgeDevices__Group__4__Impl ;
    public final void rule__EdgeDevices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3254:1: ( rule__EdgeDevices__Group__4__Impl )
            // InternalIoTECS.g:3255:2: rule__EdgeDevices__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EdgeDevices__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__4"


    // $ANTLR start "rule__EdgeDevices__Group__4__Impl"
    // InternalIoTECS.g:3261:1: rule__EdgeDevices__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__EdgeDevices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3265:1: ( ( ( ',' )? ) )
            // InternalIoTECS.g:3266:1: ( ( ',' )? )
            {
            // InternalIoTECS.g:3266:1: ( ( ',' )? )
            // InternalIoTECS.g:3267:2: ( ',' )?
            {
             before(grammarAccess.getEdgeDevicesAccess().getCommaKeyword_4()); 
            // InternalIoTECS.g:3268:2: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIoTECS.g:3268:3: ','
                    {
                    match(input,52,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEdgeDevicesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__Group__4__Impl"


    // $ANTLR start "rule__Devices__Group__0"
    // InternalIoTECS.g:3277:1: rule__Devices__Group__0 : rule__Devices__Group__0__Impl rule__Devices__Group__1 ;
    public final void rule__Devices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3281:1: ( rule__Devices__Group__0__Impl rule__Devices__Group__1 )
            // InternalIoTECS.g:3282:2: rule__Devices__Group__0__Impl rule__Devices__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Devices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Devices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__0"


    // $ANTLR start "rule__Devices__Group__0__Impl"
    // InternalIoTECS.g:3289:1: rule__Devices__Group__0__Impl : ( ( rule__Devices__AAssignment_0 ) ) ;
    public final void rule__Devices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3293:1: ( ( ( rule__Devices__AAssignment_0 ) ) )
            // InternalIoTECS.g:3294:1: ( ( rule__Devices__AAssignment_0 ) )
            {
            // InternalIoTECS.g:3294:1: ( ( rule__Devices__AAssignment_0 ) )
            // InternalIoTECS.g:3295:2: ( rule__Devices__AAssignment_0 )
            {
             before(grammarAccess.getDevicesAccess().getAAssignment_0()); 
            // InternalIoTECS.g:3296:2: ( rule__Devices__AAssignment_0 )
            // InternalIoTECS.g:3296:3: rule__Devices__AAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Devices__AAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDevicesAccess().getAAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__0__Impl"


    // $ANTLR start "rule__Devices__Group__1"
    // InternalIoTECS.g:3304:1: rule__Devices__Group__1 : rule__Devices__Group__1__Impl rule__Devices__Group__2 ;
    public final void rule__Devices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3308:1: ( rule__Devices__Group__1__Impl rule__Devices__Group__2 )
            // InternalIoTECS.g:3309:2: rule__Devices__Group__1__Impl rule__Devices__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Devices__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Devices__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__1"


    // $ANTLR start "rule__Devices__Group__1__Impl"
    // InternalIoTECS.g:3316:1: rule__Devices__Group__1__Impl : ( '[' ) ;
    public final void rule__Devices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3320:1: ( ( '[' ) )
            // InternalIoTECS.g:3321:1: ( '[' )
            {
            // InternalIoTECS.g:3321:1: ( '[' )
            // InternalIoTECS.g:3322:2: '['
            {
             before(grammarAccess.getDevicesAccess().getLeftSquareBracketKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDevicesAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__1__Impl"


    // $ANTLR start "rule__Devices__Group__2"
    // InternalIoTECS.g:3331:1: rule__Devices__Group__2 : rule__Devices__Group__2__Impl rule__Devices__Group__3 ;
    public final void rule__Devices__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3335:1: ( rule__Devices__Group__2__Impl rule__Devices__Group__3 )
            // InternalIoTECS.g:3336:2: rule__Devices__Group__2__Impl rule__Devices__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Devices__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Devices__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__2"


    // $ANTLR start "rule__Devices__Group__2__Impl"
    // InternalIoTECS.g:3343:1: rule__Devices__Group__2__Impl : ( ( rule__Devices__NAssignment_2 ) ) ;
    public final void rule__Devices__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3347:1: ( ( ( rule__Devices__NAssignment_2 ) ) )
            // InternalIoTECS.g:3348:1: ( ( rule__Devices__NAssignment_2 ) )
            {
            // InternalIoTECS.g:3348:1: ( ( rule__Devices__NAssignment_2 ) )
            // InternalIoTECS.g:3349:2: ( rule__Devices__NAssignment_2 )
            {
             before(grammarAccess.getDevicesAccess().getNAssignment_2()); 
            // InternalIoTECS.g:3350:2: ( rule__Devices__NAssignment_2 )
            // InternalIoTECS.g:3350:3: rule__Devices__NAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Devices__NAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDevicesAccess().getNAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__2__Impl"


    // $ANTLR start "rule__Devices__Group__3"
    // InternalIoTECS.g:3358:1: rule__Devices__Group__3 : rule__Devices__Group__3__Impl rule__Devices__Group__4 ;
    public final void rule__Devices__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3362:1: ( rule__Devices__Group__3__Impl rule__Devices__Group__4 )
            // InternalIoTECS.g:3363:2: rule__Devices__Group__3__Impl rule__Devices__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Devices__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Devices__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__3"


    // $ANTLR start "rule__Devices__Group__3__Impl"
    // InternalIoTECS.g:3370:1: rule__Devices__Group__3__Impl : ( ']' ) ;
    public final void rule__Devices__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3374:1: ( ( ']' ) )
            // InternalIoTECS.g:3375:1: ( ']' )
            {
            // InternalIoTECS.g:3375:1: ( ']' )
            // InternalIoTECS.g:3376:2: ']'
            {
             before(grammarAccess.getDevicesAccess().getRightSquareBracketKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDevicesAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__3__Impl"


    // $ANTLR start "rule__Devices__Group__4"
    // InternalIoTECS.g:3385:1: rule__Devices__Group__4 : rule__Devices__Group__4__Impl ;
    public final void rule__Devices__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3389:1: ( rule__Devices__Group__4__Impl )
            // InternalIoTECS.g:3390:2: rule__Devices__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Devices__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__4"


    // $ANTLR start "rule__Devices__Group__4__Impl"
    // InternalIoTECS.g:3396:1: rule__Devices__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__Devices__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3400:1: ( ( ( ',' )? ) )
            // InternalIoTECS.g:3401:1: ( ( ',' )? )
            {
            // InternalIoTECS.g:3401:1: ( ( ',' )? )
            // InternalIoTECS.g:3402:2: ( ',' )?
            {
             before(grammarAccess.getDevicesAccess().getCommaKeyword_4()); 
            // InternalIoTECS.g:3403:2: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIoTECS.g:3403:3: ','
                    {
                    match(input,52,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDevicesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalIoTECS.g:3412:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3416:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalIoTECS.g:3417:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalIoTECS.g:3424:1: rule__Device__Group__0__Impl : ( 'Device:' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3428:1: ( ( 'Device:' ) )
            // InternalIoTECS.g:3429:1: ( 'Device:' )
            {
            // InternalIoTECS.g:3429:1: ( 'Device:' )
            // InternalIoTECS.g:3430:2: 'Device:'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalIoTECS.g:3439:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3443:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalIoTECS.g:3444:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalIoTECS.g:3451:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3455:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // InternalIoTECS.g:3456:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // InternalIoTECS.g:3456:1: ( ( rule__Device__NameAssignment_1 ) )
            // InternalIoTECS.g:3457:2: ( rule__Device__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            // InternalIoTECS.g:3458:2: ( rule__Device__NameAssignment_1 )
            // InternalIoTECS.g:3458:3: rule__Device__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalIoTECS.g:3466:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3470:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalIoTECS.g:3471:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalIoTECS.g:3478:1: rule__Device__Group__2__Impl : ( '{' ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3482:1: ( ( '{' ) )
            // InternalIoTECS.g:3483:1: ( '{' )
            {
            // InternalIoTECS.g:3483:1: ( '{' )
            // InternalIoTECS.g:3484:2: '{'
            {
             before(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalIoTECS.g:3493:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3497:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalIoTECS.g:3498:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalIoTECS.g:3505:1: rule__Device__Group__3__Impl : ( 'period:' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3509:1: ( ( 'period:' ) )
            // InternalIoTECS.g:3510:1: ( 'period:' )
            {
            // InternalIoTECS.g:3510:1: ( 'period:' )
            // InternalIoTECS.g:3511:2: 'period:'
            {
             before(grammarAccess.getDeviceAccess().getPeriodKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getPeriodKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalIoTECS.g:3520:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3524:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalIoTECS.g:3525:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalIoTECS.g:3532:1: rule__Device__Group__4__Impl : ( ( rule__Device__PeriodAssignment_4 ) ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3536:1: ( ( ( rule__Device__PeriodAssignment_4 ) ) )
            // InternalIoTECS.g:3537:1: ( ( rule__Device__PeriodAssignment_4 ) )
            {
            // InternalIoTECS.g:3537:1: ( ( rule__Device__PeriodAssignment_4 ) )
            // InternalIoTECS.g:3538:2: ( rule__Device__PeriodAssignment_4 )
            {
             before(grammarAccess.getDeviceAccess().getPeriodAssignment_4()); 
            // InternalIoTECS.g:3539:2: ( rule__Device__PeriodAssignment_4 )
            // InternalIoTECS.g:3539:3: rule__Device__PeriodAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Device__PeriodAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getPeriodAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalIoTECS.g:3547:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3551:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalIoTECS.g:3552:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Device__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalIoTECS.g:3559:1: rule__Device__Group__5__Impl : ( 'payload:' ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3563:1: ( ( 'payload:' ) )
            // InternalIoTECS.g:3564:1: ( 'payload:' )
            {
            // InternalIoTECS.g:3564:1: ( 'payload:' )
            // InternalIoTECS.g:3565:2: 'payload:'
            {
             before(grammarAccess.getDeviceAccess().getPayloadKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getPayloadKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group__6"
    // InternalIoTECS.g:3574:1: rule__Device__Group__6 : rule__Device__Group__6__Impl rule__Device__Group__7 ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3578:1: ( rule__Device__Group__6__Impl rule__Device__Group__7 )
            // InternalIoTECS.g:3579:2: rule__Device__Group__6__Impl rule__Device__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__Device__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6"


    // $ANTLR start "rule__Device__Group__6__Impl"
    // InternalIoTECS.g:3586:1: rule__Device__Group__6__Impl : ( ( rule__Device__PayloadAssignment_6 ) ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3590:1: ( ( ( rule__Device__PayloadAssignment_6 ) ) )
            // InternalIoTECS.g:3591:1: ( ( rule__Device__PayloadAssignment_6 ) )
            {
            // InternalIoTECS.g:3591:1: ( ( rule__Device__PayloadAssignment_6 ) )
            // InternalIoTECS.g:3592:2: ( rule__Device__PayloadAssignment_6 )
            {
             before(grammarAccess.getDeviceAccess().getPayloadAssignment_6()); 
            // InternalIoTECS.g:3593:2: ( rule__Device__PayloadAssignment_6 )
            // InternalIoTECS.g:3593:3: rule__Device__PayloadAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Device__PayloadAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getPayloadAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6__Impl"


    // $ANTLR start "rule__Device__Group__7"
    // InternalIoTECS.g:3601:1: rule__Device__Group__7 : rule__Device__Group__7__Impl rule__Device__Group__8 ;
    public final void rule__Device__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3605:1: ( rule__Device__Group__7__Impl rule__Device__Group__8 )
            // InternalIoTECS.g:3606:2: rule__Device__Group__7__Impl rule__Device__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Device__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7"


    // $ANTLR start "rule__Device__Group__7__Impl"
    // InternalIoTECS.g:3613:1: rule__Device__Group__7__Impl : ( ( rule__Device__PayloadUnitAssignment_7 ) ) ;
    public final void rule__Device__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3617:1: ( ( ( rule__Device__PayloadUnitAssignment_7 ) ) )
            // InternalIoTECS.g:3618:1: ( ( rule__Device__PayloadUnitAssignment_7 ) )
            {
            // InternalIoTECS.g:3618:1: ( ( rule__Device__PayloadUnitAssignment_7 ) )
            // InternalIoTECS.g:3619:2: ( rule__Device__PayloadUnitAssignment_7 )
            {
             before(grammarAccess.getDeviceAccess().getPayloadUnitAssignment_7()); 
            // InternalIoTECS.g:3620:2: ( rule__Device__PayloadUnitAssignment_7 )
            // InternalIoTECS.g:3620:3: rule__Device__PayloadUnitAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Device__PayloadUnitAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getPayloadUnitAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7__Impl"


    // $ANTLR start "rule__Device__Group__8"
    // InternalIoTECS.g:3628:1: rule__Device__Group__8 : rule__Device__Group__8__Impl ;
    public final void rule__Device__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3632:1: ( rule__Device__Group__8__Impl )
            // InternalIoTECS.g:3633:2: rule__Device__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__8"


    // $ANTLR start "rule__Device__Group__8__Impl"
    // InternalIoTECS.g:3639:1: rule__Device__Group__8__Impl : ( '}' ) ;
    public final void rule__Device__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3643:1: ( ( '}' ) )
            // InternalIoTECS.g:3644:1: ( '}' )
            {
            // InternalIoTECS.g:3644:1: ( '}' )
            // InternalIoTECS.g:3645:2: '}'
            {
             before(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__8__Impl"


    // $ANTLR start "rule__IP__Group__0"
    // InternalIoTECS.g:3655:1: rule__IP__Group__0 : rule__IP__Group__0__Impl rule__IP__Group__1 ;
    public final void rule__IP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3659:1: ( rule__IP__Group__0__Impl rule__IP__Group__1 )
            // InternalIoTECS.g:3660:2: rule__IP__Group__0__Impl rule__IP__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__IP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__0"


    // $ANTLR start "rule__IP__Group__0__Impl"
    // InternalIoTECS.g:3667:1: rule__IP__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__IP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3671:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:3672:1: ( RULE_INT )
            {
            // InternalIoTECS.g:3672:1: ( RULE_INT )
            // InternalIoTECS.g:3673:2: RULE_INT
            {
             before(grammarAccess.getIPAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__0__Impl"


    // $ANTLR start "rule__IP__Group__1"
    // InternalIoTECS.g:3682:1: rule__IP__Group__1 : rule__IP__Group__1__Impl rule__IP__Group__2 ;
    public final void rule__IP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3686:1: ( rule__IP__Group__1__Impl rule__IP__Group__2 )
            // InternalIoTECS.g:3687:2: rule__IP__Group__1__Impl rule__IP__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__1"


    // $ANTLR start "rule__IP__Group__1__Impl"
    // InternalIoTECS.g:3694:1: rule__IP__Group__1__Impl : ( '.' ) ;
    public final void rule__IP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3698:1: ( ( '.' ) )
            // InternalIoTECS.g:3699:1: ( '.' )
            {
            // InternalIoTECS.g:3699:1: ( '.' )
            // InternalIoTECS.g:3700:2: '.'
            {
             before(grammarAccess.getIPAccess().getFullStopKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__1__Impl"


    // $ANTLR start "rule__IP__Group__2"
    // InternalIoTECS.g:3709:1: rule__IP__Group__2 : rule__IP__Group__2__Impl rule__IP__Group__3 ;
    public final void rule__IP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3713:1: ( rule__IP__Group__2__Impl rule__IP__Group__3 )
            // InternalIoTECS.g:3714:2: rule__IP__Group__2__Impl rule__IP__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__IP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__2"


    // $ANTLR start "rule__IP__Group__2__Impl"
    // InternalIoTECS.g:3721:1: rule__IP__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__IP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3725:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:3726:1: ( RULE_INT )
            {
            // InternalIoTECS.g:3726:1: ( RULE_INT )
            // InternalIoTECS.g:3727:2: RULE_INT
            {
             before(grammarAccess.getIPAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__2__Impl"


    // $ANTLR start "rule__IP__Group__3"
    // InternalIoTECS.g:3736:1: rule__IP__Group__3 : rule__IP__Group__3__Impl rule__IP__Group__4 ;
    public final void rule__IP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3740:1: ( rule__IP__Group__3__Impl rule__IP__Group__4 )
            // InternalIoTECS.g:3741:2: rule__IP__Group__3__Impl rule__IP__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__IP__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__3"


    // $ANTLR start "rule__IP__Group__3__Impl"
    // InternalIoTECS.g:3748:1: rule__IP__Group__3__Impl : ( '.' ) ;
    public final void rule__IP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3752:1: ( ( '.' ) )
            // InternalIoTECS.g:3753:1: ( '.' )
            {
            // InternalIoTECS.g:3753:1: ( '.' )
            // InternalIoTECS.g:3754:2: '.'
            {
             before(grammarAccess.getIPAccess().getFullStopKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__3__Impl"


    // $ANTLR start "rule__IP__Group__4"
    // InternalIoTECS.g:3763:1: rule__IP__Group__4 : rule__IP__Group__4__Impl rule__IP__Group__5 ;
    public final void rule__IP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3767:1: ( rule__IP__Group__4__Impl rule__IP__Group__5 )
            // InternalIoTECS.g:3768:2: rule__IP__Group__4__Impl rule__IP__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__IP__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__4"


    // $ANTLR start "rule__IP__Group__4__Impl"
    // InternalIoTECS.g:3775:1: rule__IP__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__IP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3779:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:3780:1: ( RULE_INT )
            {
            // InternalIoTECS.g:3780:1: ( RULE_INT )
            // InternalIoTECS.g:3781:2: RULE_INT
            {
             before(grammarAccess.getIPAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__4__Impl"


    // $ANTLR start "rule__IP__Group__5"
    // InternalIoTECS.g:3790:1: rule__IP__Group__5 : rule__IP__Group__5__Impl rule__IP__Group__6 ;
    public final void rule__IP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3794:1: ( rule__IP__Group__5__Impl rule__IP__Group__6 )
            // InternalIoTECS.g:3795:2: rule__IP__Group__5__Impl rule__IP__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__IP__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__5"


    // $ANTLR start "rule__IP__Group__5__Impl"
    // InternalIoTECS.g:3802:1: rule__IP__Group__5__Impl : ( '.' ) ;
    public final void rule__IP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3806:1: ( ( '.' ) )
            // InternalIoTECS.g:3807:1: ( '.' )
            {
            // InternalIoTECS.g:3807:1: ( '.' )
            // InternalIoTECS.g:3808:2: '.'
            {
             before(grammarAccess.getIPAccess().getFullStopKeyword_5()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__5__Impl"


    // $ANTLR start "rule__IP__Group__6"
    // InternalIoTECS.g:3817:1: rule__IP__Group__6 : rule__IP__Group__6__Impl ;
    public final void rule__IP__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3821:1: ( rule__IP__Group__6__Impl )
            // InternalIoTECS.g:3822:2: rule__IP__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IP__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__6"


    // $ANTLR start "rule__IP__Group__6__Impl"
    // InternalIoTECS.g:3828:1: rule__IP__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__IP__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3832:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:3833:1: ( RULE_INT )
            {
            // InternalIoTECS.g:3833:1: ( RULE_INT )
            // InternalIoTECS.g:3834:2: RULE_INT
            {
             before(grammarAccess.getIPAccess().getINTTerminalRuleCall_6()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getINTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__6__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalIoTECS.g:3844:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3848:1: ( ( ruleElement ) )
            // InternalIoTECS.g:3849:2: ( ruleElement )
            {
            // InternalIoTECS.g:3849:2: ( ruleElement )
            // InternalIoTECS.g:3850:3: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Platform__NameAssignment_1"
    // InternalIoTECS.g:3859:1: rule__Platform__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Platform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3863:1: ( ( RULE_ID ) )
            // InternalIoTECS.g:3864:2: ( RULE_ID )
            {
            // InternalIoTECS.g:3864:2: ( RULE_ID )
            // InternalIoTECS.g:3865:3: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__NameAssignment_1"


    // $ANTLR start "rule__Platform__TypeAssignment_4"
    // InternalIoTECS.g:3874:1: rule__Platform__TypeAssignment_4 : ( rulePlatformType ) ;
    public final void rule__Platform__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3878:1: ( ( rulePlatformType ) )
            // InternalIoTECS.g:3879:2: ( rulePlatformType )
            {
            // InternalIoTECS.g:3879:2: ( rulePlatformType )
            // InternalIoTECS.g:3880:3: rulePlatformType
            {
             before(grammarAccess.getPlatformAccess().getTypePlatformTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformType();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getTypePlatformTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__TypeAssignment_4"


    // $ANTLR start "rule__Platform__NetworkAdapterAssignment_6"
    // InternalIoTECS.g:3889:1: rule__Platform__NetworkAdapterAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Platform__NetworkAdapterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3893:1: ( ( RULE_STRING ) )
            // InternalIoTECS.g:3894:2: ( RULE_STRING )
            {
            // InternalIoTECS.g:3894:2: ( RULE_STRING )
            // InternalIoTECS.g:3895:3: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getNetworkAdapterSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getNetworkAdapterSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__NetworkAdapterAssignment_6"


    // $ANTLR start "rule__Platform__LocationAssignment_7_1"
    // InternalIoTECS.g:3904:1: rule__Platform__LocationAssignment_7_1 : ( ruleIP ) ;
    public final void rule__Platform__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3908:1: ( ( ruleIP ) )
            // InternalIoTECS.g:3909:2: ( ruleIP )
            {
            // InternalIoTECS.g:3909:2: ( ruleIP )
            // InternalIoTECS.g:3910:3: ruleIP
            {
             before(grammarAccess.getPlatformAccess().getLocationIPParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getLocationIPParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__LocationAssignment_7_1"


    // $ANTLR start "rule__Platform__UserAssignment_7_3"
    // InternalIoTECS.g:3919:1: rule__Platform__UserAssignment_7_3 : ( RULE_ID ) ;
    public final void rule__Platform__UserAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3923:1: ( ( RULE_ID ) )
            // InternalIoTECS.g:3924:2: ( RULE_ID )
            {
            // InternalIoTECS.g:3924:2: ( RULE_ID )
            // InternalIoTECS.g:3925:3: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getUserIDTerminalRuleCall_7_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getUserIDTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__UserAssignment_7_3"


    // $ANTLR start "rule__Platform__PasswordAssignment_7_5"
    // InternalIoTECS.g:3934:1: rule__Platform__PasswordAssignment_7_5 : ( RULE_STRING ) ;
    public final void rule__Platform__PasswordAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3938:1: ( ( RULE_STRING ) )
            // InternalIoTECS.g:3939:2: ( RULE_STRING )
            {
            // InternalIoTECS.g:3939:2: ( RULE_STRING )
            // InternalIoTECS.g:3940:3: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getPasswordSTRINGTerminalRuleCall_7_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getPasswordSTRINGTerminalRuleCall_7_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__PasswordAssignment_7_5"


    // $ANTLR start "rule__Platform__CPUAssignment_8_1"
    // InternalIoTECS.g:3949:1: rule__Platform__CPUAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__Platform__CPUAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3953:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:3954:2: ( RULE_INT )
            {
            // InternalIoTECS.g:3954:2: ( RULE_INT )
            // InternalIoTECS.g:3955:3: RULE_INT
            {
             before(grammarAccess.getPlatformAccess().getCPUINTTerminalRuleCall_8_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getCPUINTTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__CPUAssignment_8_1"


    // $ANTLR start "rule__Platform__MemoryAssignment_8_3"
    // InternalIoTECS.g:3964:1: rule__Platform__MemoryAssignment_8_3 : ( RULE_INT ) ;
    public final void rule__Platform__MemoryAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3968:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:3969:2: ( RULE_INT )
            {
            // InternalIoTECS.g:3969:2: ( RULE_INT )
            // InternalIoTECS.g:3970:3: RULE_INT
            {
             before(grammarAccess.getPlatformAccess().getMemoryINTTerminalRuleCall_8_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getMemoryINTTerminalRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__MemoryAssignment_8_3"


    // $ANTLR start "rule__Platform__IpVMAssignment_9_1"
    // InternalIoTECS.g:3979:1: rule__Platform__IpVMAssignment_9_1 : ( ruleIP ) ;
    public final void rule__Platform__IpVMAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3983:1: ( ( ruleIP ) )
            // InternalIoTECS.g:3984:2: ( ruleIP )
            {
            // InternalIoTECS.g:3984:2: ( ruleIP )
            // InternalIoTECS.g:3985:3: ruleIP
            {
             before(grammarAccess.getPlatformAccess().getIpVMIPParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getIpVMIPParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__IpVMAssignment_9_1"


    // $ANTLR start "rule__Platform__UserVMAssignment_9_3"
    // InternalIoTECS.g:3994:1: rule__Platform__UserVMAssignment_9_3 : ( RULE_ID ) ;
    public final void rule__Platform__UserVMAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:3998:1: ( ( RULE_ID ) )
            // InternalIoTECS.g:3999:2: ( RULE_ID )
            {
            // InternalIoTECS.g:3999:2: ( RULE_ID )
            // InternalIoTECS.g:4000:3: RULE_ID
            {
             before(grammarAccess.getPlatformAccess().getUserVMIDTerminalRuleCall_9_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getUserVMIDTerminalRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__UserVMAssignment_9_3"


    // $ANTLR start "rule__Platform__PasswordVMAssignment_9_5"
    // InternalIoTECS.g:4009:1: rule__Platform__PasswordVMAssignment_9_5 : ( RULE_STRING ) ;
    public final void rule__Platform__PasswordVMAssignment_9_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4013:1: ( ( RULE_STRING ) )
            // InternalIoTECS.g:4014:2: ( RULE_STRING )
            {
            // InternalIoTECS.g:4014:2: ( RULE_STRING )
            // InternalIoTECS.g:4015:3: RULE_STRING
            {
             before(grammarAccess.getPlatformAccess().getPasswordVMSTRINGTerminalRuleCall_9_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getPasswordVMSTRINGTerminalRuleCall_9_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platform__PasswordVMAssignment_9_5"


    // $ANTLR start "rule__Simulator__DurationAssignment_3"
    // InternalIoTECS.g:4024:1: rule__Simulator__DurationAssignment_3 : ( RULE_INT ) ;
    public final void rule__Simulator__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4028:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4029:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4029:2: ( RULE_INT )
            // InternalIoTECS.g:4030:3: RULE_INT
            {
             before(grammarAccess.getSimulatorAccess().getDurationINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getDurationINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__DurationAssignment_3"


    // $ANTLR start "rule__Simulator__DurationUnitAssignment_4"
    // InternalIoTECS.g:4039:1: rule__Simulator__DurationUnitAssignment_4 : ( ruleTimeUnit ) ;
    public final void rule__Simulator__DurationUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4043:1: ( ( ruleTimeUnit ) )
            // InternalIoTECS.g:4044:2: ( ruleTimeUnit )
            {
            // InternalIoTECS.g:4044:2: ( ruleTimeUnit )
            // InternalIoTECS.g:4045:3: ruleTimeUnit
            {
             before(grammarAccess.getSimulatorAccess().getDurationUnitTimeUnitEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getSimulatorAccess().getDurationUnitTimeUnitEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__DurationUnitAssignment_4"


    // $ANTLR start "rule__Simulator__StepAssignment_6"
    // InternalIoTECS.g:4054:1: rule__Simulator__StepAssignment_6 : ( RULE_INT ) ;
    public final void rule__Simulator__StepAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4058:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4059:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4059:2: ( RULE_INT )
            // InternalIoTECS.g:4060:3: RULE_INT
            {
             before(grammarAccess.getSimulatorAccess().getStepINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSimulatorAccess().getStepINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__StepAssignment_6"


    // $ANTLR start "rule__Simulator__StepUnitAssignment_7"
    // InternalIoTECS.g:4069:1: rule__Simulator__StepUnitAssignment_7 : ( ruleTimeUnit ) ;
    public final void rule__Simulator__StepUnitAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4073:1: ( ( ruleTimeUnit ) )
            // InternalIoTECS.g:4074:2: ( ruleTimeUnit )
            {
            // InternalIoTECS.g:4074:2: ( ruleTimeUnit )
            // InternalIoTECS.g:4075:3: ruleTimeUnit
            {
             before(grammarAccess.getSimulatorAccess().getStepUnitTimeUnitEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getSimulatorAccess().getStepUnitTimeUnitEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__StepUnitAssignment_7"


    // $ANTLR start "rule__Simulator__SimulationNodesAssignment_10"
    // InternalIoTECS.g:4084:1: rule__Simulator__SimulationNodesAssignment_10 : ( ruleSimulationNodes ) ;
    public final void rule__Simulator__SimulationNodesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4088:1: ( ( ruleSimulationNodes ) )
            // InternalIoTECS.g:4089:2: ( ruleSimulationNodes )
            {
            // InternalIoTECS.g:4089:2: ( ruleSimulationNodes )
            // InternalIoTECS.g:4090:3: ruleSimulationNodes
            {
             before(grammarAccess.getSimulatorAccess().getSimulationNodesSimulationNodesParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleSimulationNodes();

            state._fsp--;

             after(grammarAccess.getSimulatorAccess().getSimulationNodesSimulationNodesParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulator__SimulationNodesAssignment_10"


    // $ANTLR start "rule__Cloud__NameAssignment_1"
    // InternalIoTECS.g:4099:1: rule__Cloud__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cloud__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4103:1: ( ( RULE_ID ) )
            // InternalIoTECS.g:4104:2: ( RULE_ID )
            {
            // InternalIoTECS.g:4104:2: ( RULE_ID )
            // InternalIoTECS.g:4105:3: RULE_ID
            {
             before(grammarAccess.getCloudAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__NameAssignment_1"


    // $ANTLR start "rule__Cloud__IpAssignment_4"
    // InternalIoTECS.g:4114:1: rule__Cloud__IpAssignment_4 : ( ruleIP ) ;
    public final void rule__Cloud__IpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4118:1: ( ( ruleIP ) )
            // InternalIoTECS.g:4119:2: ( ruleIP )
            {
            // InternalIoTECS.g:4119:2: ( ruleIP )
            // InternalIoTECS.g:4120:3: ruleIP
            {
             before(grammarAccess.getCloudAccess().getIpIPParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getCloudAccess().getIpIPParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__IpAssignment_4"


    // $ANTLR start "rule__Cloud__PortAssignment_6"
    // InternalIoTECS.g:4129:1: rule__Cloud__PortAssignment_6 : ( RULE_INT ) ;
    public final void rule__Cloud__PortAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4133:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4134:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4134:2: ( RULE_INT )
            // InternalIoTECS.g:4135:3: RULE_INT
            {
             before(grammarAccess.getCloudAccess().getPortINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getPortINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__PortAssignment_6"


    // $ANTLR start "rule__Cloud__UsrnameAssignment_7_1"
    // InternalIoTECS.g:4144:1: rule__Cloud__UsrnameAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Cloud__UsrnameAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4148:1: ( ( RULE_STRING ) )
            // InternalIoTECS.g:4149:2: ( RULE_STRING )
            {
            // InternalIoTECS.g:4149:2: ( RULE_STRING )
            // InternalIoTECS.g:4150:3: RULE_STRING
            {
             before(grammarAccess.getCloudAccess().getUsrnameSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getUsrnameSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__UsrnameAssignment_7_1"


    // $ANTLR start "rule__Cloud__PasswordAssignment_7_3"
    // InternalIoTECS.g:4159:1: rule__Cloud__PasswordAssignment_7_3 : ( RULE_STRING ) ;
    public final void rule__Cloud__PasswordAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4163:1: ( ( RULE_STRING ) )
            // InternalIoTECS.g:4164:2: ( RULE_STRING )
            {
            // InternalIoTECS.g:4164:2: ( RULE_STRING )
            // InternalIoTECS.g:4165:3: RULE_STRING
            {
             before(grammarAccess.getCloudAccess().getPasswordSTRINGTerminalRuleCall_7_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getPasswordSTRINGTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__PasswordAssignment_7_3"


    // $ANTLR start "rule__Cloud__WorkloadAssignment_7_5"
    // InternalIoTECS.g:4174:1: rule__Cloud__WorkloadAssignment_7_5 : ( RULE_INT ) ;
    public final void rule__Cloud__WorkloadAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4178:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4179:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4179:2: ( RULE_INT )
            // InternalIoTECS.g:4180:3: RULE_INT
            {
             before(grammarAccess.getCloudAccess().getWorkloadINTTerminalRuleCall_7_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getWorkloadINTTerminalRuleCall_7_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__WorkloadAssignment_7_5"


    // $ANTLR start "rule__Cloud__WorkloadUnitAssignment_7_6"
    // InternalIoTECS.g:4189:1: rule__Cloud__WorkloadUnitAssignment_7_6 : ( ruleTimeUnitForWorkload ) ;
    public final void rule__Cloud__WorkloadUnitAssignment_7_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4193:1: ( ( ruleTimeUnitForWorkload ) )
            // InternalIoTECS.g:4194:2: ( ruleTimeUnitForWorkload )
            {
            // InternalIoTECS.g:4194:2: ( ruleTimeUnitForWorkload )
            // InternalIoTECS.g:4195:3: ruleTimeUnitForWorkload
            {
             before(grammarAccess.getCloudAccess().getWorkloadUnitTimeUnitForWorkloadEnumRuleCall_7_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnitForWorkload();

            state._fsp--;

             after(grammarAccess.getCloudAccess().getWorkloadUnitTimeUnitForWorkloadEnumRuleCall_7_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__WorkloadUnitAssignment_7_6"


    // $ANTLR start "rule__Cloud__NetworkAdapterAssignment_8_1"
    // InternalIoTECS.g:4204:1: rule__Cloud__NetworkAdapterAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Cloud__NetworkAdapterAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4208:1: ( ( RULE_STRING ) )
            // InternalIoTECS.g:4209:2: ( RULE_STRING )
            {
            // InternalIoTECS.g:4209:2: ( RULE_STRING )
            // InternalIoTECS.g:4210:3: RULE_STRING
            {
             before(grammarAccess.getCloudAccess().getNetworkAdapterSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCloudAccess().getNetworkAdapterSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__NetworkAdapterAssignment_8_1"


    // $ANTLR start "rule__SimulationNode__NameAssignment_1"
    // InternalIoTECS.g:4219:1: rule__SimulationNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimulationNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4223:1: ( ( RULE_ID ) )
            // InternalIoTECS.g:4224:2: ( RULE_ID )
            {
            // InternalIoTECS.g:4224:2: ( RULE_ID )
            // InternalIoTECS.g:4225:3: RULE_ID
            {
             before(grammarAccess.getSimulationNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__NameAssignment_1"


    // $ANTLR start "rule__SimulationNode__PlatformAssignment_4"
    // InternalIoTECS.g:4234:1: rule__SimulationNode__PlatformAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SimulationNode__PlatformAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4238:1: ( ( ( RULE_ID ) ) )
            // InternalIoTECS.g:4239:2: ( ( RULE_ID ) )
            {
            // InternalIoTECS.g:4239:2: ( ( RULE_ID ) )
            // InternalIoTECS.g:4240:3: ( RULE_ID )
            {
             before(grammarAccess.getSimulationNodeAccess().getPlatformPlatformCrossReference_4_0()); 
            // InternalIoTECS.g:4241:3: ( RULE_ID )
            // InternalIoTECS.g:4242:4: RULE_ID
            {
             before(grammarAccess.getSimulationNodeAccess().getPlatformPlatformIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimulationNodeAccess().getPlatformPlatformIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSimulationNodeAccess().getPlatformPlatformCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__PlatformAssignment_4"


    // $ANTLR start "rule__SimulationNode__EdgeDevicesAssignment_7"
    // InternalIoTECS.g:4253:1: rule__SimulationNode__EdgeDevicesAssignment_7 : ( ruleEdgeDevices ) ;
    public final void rule__SimulationNode__EdgeDevicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4257:1: ( ( ruleEdgeDevices ) )
            // InternalIoTECS.g:4258:2: ( ruleEdgeDevices )
            {
            // InternalIoTECS.g:4258:2: ( ruleEdgeDevices )
            // InternalIoTECS.g:4259:3: ruleEdgeDevices
            {
             before(grammarAccess.getSimulationNodeAccess().getEdgeDevicesEdgeDevicesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEdgeDevices();

            state._fsp--;

             after(grammarAccess.getSimulationNodeAccess().getEdgeDevicesEdgeDevicesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNode__EdgeDevicesAssignment_7"


    // $ANTLR start "rule__SimulationNodes__SnAssignment_0"
    // InternalIoTECS.g:4268:1: rule__SimulationNodes__SnAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SimulationNodes__SnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4272:1: ( ( ( RULE_ID ) ) )
            // InternalIoTECS.g:4273:2: ( ( RULE_ID ) )
            {
            // InternalIoTECS.g:4273:2: ( ( RULE_ID ) )
            // InternalIoTECS.g:4274:3: ( RULE_ID )
            {
             before(grammarAccess.getSimulationNodesAccess().getSnSimulationNodeCrossReference_0_0()); 
            // InternalIoTECS.g:4275:3: ( RULE_ID )
            // InternalIoTECS.g:4276:4: RULE_ID
            {
             before(grammarAccess.getSimulationNodesAccess().getSnSimulationNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimulationNodesAccess().getSnSimulationNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSimulationNodesAccess().getSnSimulationNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__SnAssignment_0"


    // $ANTLR start "rule__SimulationNodes__NAssignment_2"
    // InternalIoTECS.g:4287:1: rule__SimulationNodes__NAssignment_2 : ( RULE_INT ) ;
    public final void rule__SimulationNodes__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4291:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4292:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4292:2: ( RULE_INT )
            // InternalIoTECS.g:4293:3: RULE_INT
            {
             before(grammarAccess.getSimulationNodesAccess().getNINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSimulationNodesAccess().getNINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimulationNodes__NAssignment_2"


    // $ANTLR start "rule__EdgeDevice__NameAssignment_1"
    // InternalIoTECS.g:4302:1: rule__EdgeDevice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EdgeDevice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4306:1: ( ( RULE_ID ) )
            // InternalIoTECS.g:4307:2: ( RULE_ID )
            {
            // InternalIoTECS.g:4307:2: ( RULE_ID )
            // InternalIoTECS.g:4308:3: RULE_ID
            {
             before(grammarAccess.getEdgeDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__NameAssignment_1"


    // $ANTLR start "rule__EdgeDevice__ProtocolAssignment_4"
    // InternalIoTECS.g:4317:1: rule__EdgeDevice__ProtocolAssignment_4 : ( ruleProtocol ) ;
    public final void rule__EdgeDevice__ProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4321:1: ( ( ruleProtocol ) )
            // InternalIoTECS.g:4322:2: ( ruleProtocol )
            {
            // InternalIoTECS.g:4322:2: ( ruleProtocol )
            // InternalIoTECS.g:4323:3: ruleProtocol
            {
             before(grammarAccess.getEdgeDeviceAccess().getProtocolProtocolEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getEdgeDeviceAccess().getProtocolProtocolEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__ProtocolAssignment_4"


    // $ANTLR start "rule__EdgeDevice__SpeedAssignment_6"
    // InternalIoTECS.g:4332:1: rule__EdgeDevice__SpeedAssignment_6 : ( ruleSpeed ) ;
    public final void rule__EdgeDevice__SpeedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4336:1: ( ( ruleSpeed ) )
            // InternalIoTECS.g:4337:2: ( ruleSpeed )
            {
            // InternalIoTECS.g:4337:2: ( ruleSpeed )
            // InternalIoTECS.g:4338:3: ruleSpeed
            {
             before(grammarAccess.getEdgeDeviceAccess().getSpeedSpeedParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSpeed();

            state._fsp--;

             after(grammarAccess.getEdgeDeviceAccess().getSpeedSpeedParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__SpeedAssignment_6"


    // $ANTLR start "rule__EdgeDevice__CloudAssignment_8"
    // InternalIoTECS.g:4347:1: rule__EdgeDevice__CloudAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__EdgeDevice__CloudAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4351:1: ( ( ( RULE_ID ) ) )
            // InternalIoTECS.g:4352:2: ( ( RULE_ID ) )
            {
            // InternalIoTECS.g:4352:2: ( ( RULE_ID ) )
            // InternalIoTECS.g:4353:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeDeviceAccess().getCloudCloudCrossReference_8_0()); 
            // InternalIoTECS.g:4354:3: ( RULE_ID )
            // InternalIoTECS.g:4355:4: RULE_ID
            {
             before(grammarAccess.getEdgeDeviceAccess().getCloudCloudIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getCloudCloudIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getEdgeDeviceAccess().getCloudCloudCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__CloudAssignment_8"


    // $ANTLR start "rule__EdgeDevice__WorkloadAssignment_10"
    // InternalIoTECS.g:4366:1: rule__EdgeDevice__WorkloadAssignment_10 : ( RULE_INT ) ;
    public final void rule__EdgeDevice__WorkloadAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4370:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4371:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4371:2: ( RULE_INT )
            // InternalIoTECS.g:4372:3: RULE_INT
            {
             before(grammarAccess.getEdgeDeviceAccess().getWorkloadINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEdgeDeviceAccess().getWorkloadINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__WorkloadAssignment_10"


    // $ANTLR start "rule__EdgeDevice__WorkloadUnitAssignment_11"
    // InternalIoTECS.g:4381:1: rule__EdgeDevice__WorkloadUnitAssignment_11 : ( ruleTimeUnitForWorkload ) ;
    public final void rule__EdgeDevice__WorkloadUnitAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4385:1: ( ( ruleTimeUnitForWorkload ) )
            // InternalIoTECS.g:4386:2: ( ruleTimeUnitForWorkload )
            {
            // InternalIoTECS.g:4386:2: ( ruleTimeUnitForWorkload )
            // InternalIoTECS.g:4387:3: ruleTimeUnitForWorkload
            {
             before(grammarAccess.getEdgeDeviceAccess().getWorkloadUnitTimeUnitForWorkloadEnumRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnitForWorkload();

            state._fsp--;

             after(grammarAccess.getEdgeDeviceAccess().getWorkloadUnitTimeUnitForWorkloadEnumRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__WorkloadUnitAssignment_11"


    // $ANTLR start "rule__EdgeDevice__DevicesAssignment_14"
    // InternalIoTECS.g:4396:1: rule__EdgeDevice__DevicesAssignment_14 : ( ruleDevices ) ;
    public final void rule__EdgeDevice__DevicesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4400:1: ( ( ruleDevices ) )
            // InternalIoTECS.g:4401:2: ( ruleDevices )
            {
            // InternalIoTECS.g:4401:2: ( ruleDevices )
            // InternalIoTECS.g:4402:3: ruleDevices
            {
             before(grammarAccess.getEdgeDeviceAccess().getDevicesDevicesParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleDevices();

            state._fsp--;

             after(grammarAccess.getEdgeDeviceAccess().getDevicesDevicesParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevice__DevicesAssignment_14"


    // $ANTLR start "rule__EdgeDevices__SaAssignment_0"
    // InternalIoTECS.g:4411:1: rule__EdgeDevices__SaAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EdgeDevices__SaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4415:1: ( ( ( RULE_ID ) ) )
            // InternalIoTECS.g:4416:2: ( ( RULE_ID ) )
            {
            // InternalIoTECS.g:4416:2: ( ( RULE_ID ) )
            // InternalIoTECS.g:4417:3: ( RULE_ID )
            {
             before(grammarAccess.getEdgeDevicesAccess().getSaEdgeDeviceCrossReference_0_0()); 
            // InternalIoTECS.g:4418:3: ( RULE_ID )
            // InternalIoTECS.g:4419:4: RULE_ID
            {
             before(grammarAccess.getEdgeDevicesAccess().getSaEdgeDeviceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEdgeDevicesAccess().getSaEdgeDeviceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEdgeDevicesAccess().getSaEdgeDeviceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__SaAssignment_0"


    // $ANTLR start "rule__EdgeDevices__NAssignment_2"
    // InternalIoTECS.g:4430:1: rule__EdgeDevices__NAssignment_2 : ( RULE_INT ) ;
    public final void rule__EdgeDevices__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4434:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4435:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4435:2: ( RULE_INT )
            // InternalIoTECS.g:4436:3: RULE_INT
            {
             before(grammarAccess.getEdgeDevicesAccess().getNINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEdgeDevicesAccess().getNINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeDevices__NAssignment_2"


    // $ANTLR start "rule__Devices__AAssignment_0"
    // InternalIoTECS.g:4445:1: rule__Devices__AAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Devices__AAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4449:1: ( ( ( RULE_ID ) ) )
            // InternalIoTECS.g:4450:2: ( ( RULE_ID ) )
            {
            // InternalIoTECS.g:4450:2: ( ( RULE_ID ) )
            // InternalIoTECS.g:4451:3: ( RULE_ID )
            {
             before(grammarAccess.getDevicesAccess().getADeviceCrossReference_0_0()); 
            // InternalIoTECS.g:4452:3: ( RULE_ID )
            // InternalIoTECS.g:4453:4: RULE_ID
            {
             before(grammarAccess.getDevicesAccess().getADeviceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDevicesAccess().getADeviceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDevicesAccess().getADeviceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__AAssignment_0"


    // $ANTLR start "rule__Devices__NAssignment_2"
    // InternalIoTECS.g:4464:1: rule__Devices__NAssignment_2 : ( RULE_INT ) ;
    public final void rule__Devices__NAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4468:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4469:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4469:2: ( RULE_INT )
            // InternalIoTECS.g:4470:3: RULE_INT
            {
             before(grammarAccess.getDevicesAccess().getNINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDevicesAccess().getNINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Devices__NAssignment_2"


    // $ANTLR start "rule__Device__NameAssignment_1"
    // InternalIoTECS.g:4479:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4483:1: ( ( RULE_ID ) )
            // InternalIoTECS.g:4484:2: ( RULE_ID )
            {
            // InternalIoTECS.g:4484:2: ( RULE_ID )
            // InternalIoTECS.g:4485:3: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_1"


    // $ANTLR start "rule__Device__PeriodAssignment_4"
    // InternalIoTECS.g:4494:1: rule__Device__PeriodAssignment_4 : ( RULE_INT ) ;
    public final void rule__Device__PeriodAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4498:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4499:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4499:2: ( RULE_INT )
            // InternalIoTECS.g:4500:3: RULE_INT
            {
             before(grammarAccess.getDeviceAccess().getPeriodINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getPeriodINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__PeriodAssignment_4"


    // $ANTLR start "rule__Device__PayloadAssignment_6"
    // InternalIoTECS.g:4509:1: rule__Device__PayloadAssignment_6 : ( RULE_INT ) ;
    public final void rule__Device__PayloadAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4513:1: ( ( RULE_INT ) )
            // InternalIoTECS.g:4514:2: ( RULE_INT )
            {
            // InternalIoTECS.g:4514:2: ( RULE_INT )
            // InternalIoTECS.g:4515:3: RULE_INT
            {
             before(grammarAccess.getDeviceAccess().getPayloadINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getPayloadINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__PayloadAssignment_6"


    // $ANTLR start "rule__Device__PayloadUnitAssignment_7"
    // InternalIoTECS.g:4524:1: rule__Device__PayloadUnitAssignment_7 : ( rulePayloadUnit ) ;
    public final void rule__Device__PayloadUnitAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTECS.g:4528:1: ( ( rulePayloadUnit ) )
            // InternalIoTECS.g:4529:2: ( rulePayloadUnit )
            {
            // InternalIoTECS.g:4529:2: ( rulePayloadUnit )
            // InternalIoTECS.g:4530:3: rulePayloadUnit
            {
             before(grammarAccess.getDeviceAccess().getPayloadUnitPayloadUnitEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePayloadUnit();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getPayloadUnitPayloadUnitEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__PayloadUnitAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0420844001000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000930000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200018000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});

}