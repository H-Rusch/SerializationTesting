package comparison;

import java.util.HashMap;
import java.util.Map;

public class DataHelper {

    // map of 10 values. Mainly numeric values but also some Strings.
    private static Map<String, Object> itemMap1;
    // map of 10 attributes. Mainly Strings, but also some numeric values.
    private static Map<String, Object> itemMap2;
    // map of 20 attributes containing only numerical values
    private static Map<String, Object> itemMap3;
    // map of 20 attributes consisting only of short and medium-sized strings
    private static Map<String, Object> itemMap4;
    // map of 20 attributes consisting only of medium-sized and long strings
    private static Map<String, Object> itemMap5;
    // map of 200 attributes. Mainly numeric values, but also Strings of varying length
    private static Map<String, Object> itemMap6;

    public static void initAll() {
        if (itemMap1 == null) {
            fillItemMap1();
        }
        if (itemMap2 == null) {
            fillItemMap2();
        }
        if (itemMap3 == null) {
            fillItemMap3();
        }
        if (itemMap4 == null) {
            fillItemMap4();
        }
        if (itemMap5 == null) {
            fillItemMap5();
        }
        if (itemMap6 == null) {
            fillItemMap6();
        }
    }

    public static Map<String, Object> getItemMap1() {
        return itemMap1;
    }

    public static Map<String, Object> getItemMap2() {
        return itemMap2;
    }

    public static Map<String, Object> getItemMap3() {
        return itemMap3;
    }

    public static Map<String, Object> getItemMap4() {
        return itemMap4;
    }

    public static Map<String, Object> getItemMap5() {
        return itemMap5;
    }

    public static Map<String, Object> getItemMap6() {
        return itemMap6;
    }

    private static void fillItemMap1() {
        itemMap1 = new HashMap<>();
        itemMap1.put("string1", "oepmLoiru ods srli m");
        itemMap1.put("string2", "m oiu  sopdrmresoilL");
        itemMap1.put("number1", 332897);
        itemMap1.put("number2", 320553);
        itemMap1.put("number3", -360426);
        itemMap1.put("number4", -969021);
        itemMap1.put("number5", 512885448.6296356);
        itemMap1.put("number6", 162272001.85713097);
        itemMap1.put("number7", 786655926.7466515);
        itemMap1.put("number8", 915099856.6312561);
    }

    private static void fillItemMap2() {
        itemMap2 = new HashMap<>();
        itemMap2.put("number1", 236049256.67272934);
        itemMap2.put("number2", 889391473.7218453);
        itemMap2.put("string1", " osLdrei pmrs ioloum");
        itemMap2.put("string2", " osrsLulomi p diomer");
        itemMap2.put("string3", "ro s  Loomsulirmiepd");
        itemMap2.put("string4", "oo um ldLssoiri mepr");
        itemMap2.put("string5", "moir oode rlu ssipLm");
        itemMap2.put("string6", "isLroeup mls i roomd");
        itemMap2.put("string7", " iosdrL iroeup slomm");
        itemMap2.put("string8", "piolmru idossoLe r m");
    }

    private static void fillItemMap3() {
        itemMap3 = new HashMap<>();
        itemMap3.put("number1", 649631);
        itemMap3.put("number2", 436352);
        itemMap3.put("number3", 812683);
        itemMap3.put("number4", 143509);
        itemMap3.put("number5", 277014);
        itemMap3.put("number6", -766747);
        itemMap3.put("number7", -953181);
        itemMap3.put("number8", -852602);
        itemMap3.put("number9", -241131);
        itemMap3.put("number10", -303712);
        itemMap3.put("number11", 92040797.1247308);
        itemMap3.put("number12", 170310159.73665464);
        itemMap3.put("number13", 976257465.1439922);
        itemMap3.put("number14", 36196059.56035532);
        itemMap3.put("number15", 805248626.9546825);
        itemMap3.put("number16", 235001911.00562805);
        itemMap3.put("number17", 297924136.95649344);
        itemMap3.put("number18", 893908671.9582729);
        itemMap3.put("number19", 991204106.7759131);
        itemMap3.put("number20", 390874966.97084445);
    }

    private static void fillItemMap4() {
        itemMap4 = new HashMap<>();
        itemMap4.put("string1", " iLm oposomldur sire");
        itemMap4.put("string2", " es Lopo iomrlrmdsiu");
        itemMap4.put("string3", "sorsdmrlLimue oi  po");
        itemMap4.put("string4", "emril  o oLrsudipmos");
        itemMap4.put("string5", "poLrliseruom s  omid");
        itemMap4.put("string6", "ioo  Limrlemdsruspo ");
        itemMap4.put("string7", "iosm  ue pirdrLoosml");
        itemMap4.put("string8", "lorm me isdui srLoop");
        itemMap4.put("string9", "Loodulmrssi  re moip");
        itemMap4.put("string10", "e uspLimoo s rmilrod");
        itemMap4.put("string11", "t iecrmt mste  diodr snsu iiaiLn,eogmacietlsposudleaotprer s uo ,n dmn");
        itemMap4.put("string12", " ntslnnpailmcismodtriumiaed ige  eotsnurmcrrt te doa ,ooL,eiudpssse   ");
        itemMap4.put("string13", "cicn pirdt sdls mmeoLsr aeonrtomsrl ud iteteo ueo,iasi  gde ,mnatnipus");
        itemMap4.put("string14", "assuisronooptcsun  n aeim oseminidtretees tLaiim dgdrl curlot  m,e dp,");
        itemMap4.put("string15", "eo,t usdttmdn uo  eLsitaie,pomr mm rlnodrrdnl epis otciga esue sciains");
        itemMap4.put("string16", "dcdm,soidtpiLmsaetumsi  nrnrustrdas nie,uircl  mn oioee totaoeg  pl se");
        itemMap4.put("string17", " tn urodusrodi   omrds mi ,geta uisen,cnsmplosoi eeliprt sadiecteLnmat");
        itemMap4.put("string18", ",eagutrdtteisLlnrmp  asneidi emd,mp meoioduoistce usic o sor ar nlst n");
        itemMap4.put("string19", "uce otuam eatsio ipinnedrtserptLomi,  tosnrdeega  l,ml ormud cssdnsii ");
        itemMap4.put("string20", "id,ti gipmu tptmss e, aLentcor adnniem o rdtscilenlseus droiuomor a es");
    }

    private static void fillItemMap5() {
        itemMap5 = new HashMap<>();
        itemMap5.put("string1", " imr Lulmcui,oa ladntropoaimmee  sou teg ndtt id,ectoriss prs esdnsine");
        itemMap5.put("string2", "peunoL  isoealiamoinrto dst, ptrlne mgu dios s,mi scdsaeudeirnt mc rte");
        itemMap5.put("string3", "eL lci st dreee s,oorsmc usro mns  meu,aimnsligapiieiddootutardptn  tn");
        itemMap5.put("string4", "ceiril aecpr dLim sttssosnou edegaio elsnad nrioo et ,d tui,umpmr nsmt");
        itemMap5.put("string5", "  sgrptsdinue,iscrc ltatreiiodouriommels omme Ltae, aio ne dt dspun ns");
        itemMap5.put("string6", "e mmcamepsocrd spdodtrrus te et,drnntiiaL imeiilgutso in ssle ou  on,a");
        itemMap5.put("string7", "ucpg ,d,uoasi e tdnia epd isiamtirmmoermeoultcndeteLirr onns  tl ssos ");
        itemMap5.put("string8", "  ssaiodc ,sasr riimstieomld Lna uo imputcdnittmlr,ed pn gneuooe reets");
        itemMap5.put("string9", "ddotpcmsu Laoteomnnn si mt,ioucssnsd mei,paetegr  rra idiei r ute llso");
        itemMap5.put("string10", "emmeta  itogrdtisoicseusd  animo , cpereolidneLa l,ssdrptn mrns u otiu");
        itemMap5.put("string11", "eod ert evegeniimgrladseotort urdoy oriri aadsoiuo aem  emt,ceuc a  sdamn aoui baiminmpturm tjtym es use eb eupaao A,rtttnsa mnutmatmnlgimeeretcp es,d sr lrL erpias.mo ruatmoulei,.t tn  l ooedacetc est euL idtsvuaks l. ssoednedteds  eqt dat  r mapluao u rod egbosml c alortSi roi usLoektoinaav t sn o");
        itemMap5.put("string12", "tamttd     one uidagyt eouidrddueteloa setinst c nsadturre utia b eevkmunitr a omit  a tc  t oeoeoltm  og r scs smslskaontamsga dmp otnre  umiesdulumeyti a bLao terts  tSjpe stcteep, rrmirul nmougaoedn eubuistoi, uanr aAsoseoL o eelrave a eieareitvrmltm odoraa emme.qo s.da pr cdL,pmad.iluooesrisc,ln");
        itemMap5.put("string13", "emaoot ulldsdam.rrtc.seteakuiem nore oo e du yesr gseyc betea eeantosprim mtsa tesro ittdrppud   ptierm  edblvo uutoritat idaa igaio ,,Ldan tormasaeoSdmsLonee u olgrmrmtp eaAu ctdi vtnuekinioi   srs o  eaa si etonu ieslolsvs etaLi lrn lo  dsod ,srmteb,qt . a tnummaocnts rla ctucgeta ujoemmue ra meud");
        itemMap5.put("string14", "uneesatlsmpre tast at ee et,re g qeu.j,dm  rrAn Lipuuiocyngtatome aio udlviiea eieneenndr us  ktsdtuordslo i noio  pam.d Sgdu,itsaeseelm booaolmemdetmuttrttuelik  tLa tutacdmscmeaeo mrtlmarmbiitomsnormaal ereuerdety d.e  vsvurbnmpposadt c   is coa audoc,oeis  it  tgl r aousre L   ra ntooo arss a s o");
        itemMap5.put("string15", "rt eoi   ismmco   slmtsoloojlel cnme  uotrutL noemlinneo armcst aom tevap mometesrmabe ,Alr ue su mnemnk si miiu,Lot.l ssm top taeioduatd buiduct saiuvedteau ude rpuaey rarrdee ndosrtamn  etaegaieso p lt  ta ot.eauetni ,gottte v idoS ridltssq   .erca ,dasersotd gaisoeep tguasmod dr yrbi kacLunaoearr");
        itemMap5.put("string16", " dlasr   slideseeosurett eyLs oe etcolis uat p treoi rd uatl eesa odram lrouta leoin syeuiodeme a.mioen meaat,bspass d a u dSee atovuinittLumoiouu vcsur g itl,tnau  eeeerlomtrtaakscr lr,dp.eo mtagdo  nmerr t,sttp dg doecs iqo a vmeuetmtb ds o jpnnoemuettnnnoi mur.gLcc sraraoi  rAiobidttmamsk a  amm ");
        itemMap5.put("string17", "rnLta Lse,oru smiir  oa tddkoole u rmt S, oate.sd oaprobsatloikvst eettp sp,omt a utroeeealnoia s yguraac ae ouieviu  agmnmt Aind aeruertverteetndu.ddmj eciurbtt  ooueuomd,pnmrcd  oi ga.cmuei umatliad piem c gLselaseteym rss tn titdraonememlaoaom sic ermaertsosats l  ilt dnld  r  sqn uos utesobe e  ");
        itemMap5.put("string18", "rkdlceteol reqovuatlui  cnnpkAt r eg,srev  jstmemeraaogtaetiar onieaLodi,  si soeosrm amam r udp uu eydus oc ayoa ubdgmdSaspt rss  rgnb tarLsca.et me   iptrtcuimdoesoealnu t deut al uLpn ubvmetmu olorsteoir maooii. tldiitmscrds aotmniu ooo erm edlua, d,nes tls aete  t adet e  eeii.tsamn oreoetmat ns");
        itemMap5.put("string19", "rt uert yeaeauemulmoa  uktvam,tteatL nue d Smcloeeiviiata cu  isrt sosnr.agsaoi  eng  am gmonetiadetir p c vrase.n,rrmumroqssbe a sdc tuyeaael o olib ddnsm i lio goe auuoeipsokt rsess opttptnd eebtm,,d ir slroto a e am ad eeomsuierr nmetcluuoion  rs mpduti jdoeldctosoeostrad r lL mtt ata.m ueeA tLdn");
        itemMap5.put("string20", "natmtic rb c   d  mo ec ea ntrLmi aracv t  stpsiAmt  yuLsge Lrtaimiocor ,omtemteornlerydesonua italareiiookdpe daosvegsgsdtt..intatidsie,jioku.sl e dr eruaaes S  na nslt,d eqbmo ntlot ssiuooaeapmrmne u sueeeus tuuut ultureeoea pd ao  n s blr am marrieml eoeaaeitl, ddrotoutumoca dpvmmt o t ersdes og ");
    }

    private static void fillItemMap6() {
        itemMap6 = new HashMap<>();
        itemMap6.put("string1", "mdspoL  re msoiiurlo");
        itemMap6.put("string2", "rpm  mseoli udosLoir");
        itemMap6.put("string3", "liLspidoeom  oms rur");
        itemMap6.put("string4", "is ropmL msoroludie ");
        itemMap6.put("string5", "o lmsim erdpLuoirso ");
        itemMap6.put("string6", "o podeismLuolrr sm i");
        itemMap6.put("string7", "Lirdolmp smui oo ers");
        itemMap6.put("string8", "irmodlLu ers osio pm");
        itemMap6.put("string9", "Loorii mu e pmsdslor");
        itemMap6.put("string10", "sirrolumosmoe  ipL d");
        itemMap6.put("string11", "da,rsitsuarestleniemuteLoodo mmeripaosp nn csrn tu  so gc,imded i tli ");
        itemMap6.put("string12", "n,nLmim rnptrc eit srtma n ieadssipdeees rstdaiuitegll o, oduosc m uoo");
        itemMap6.put("string13", "crisctndi ge rpoe eine setoo,l m r dLstmspdo imutnauue aodt ls,mrsniai");
        itemMap6.put("string14", " nudiatoaei tnssrus, ommsupescoee i,crrtiL dose lg eild oapdrimn n tmt");
        itemMap6.put("string15", "ioesdo adenisLnn cidda ropsutecm rgsrt retooemiut, auim l lns ,p itesm");
        itemMap6.put("string16", "en,eirs tosmtoom tomnung,epsrt cidnipeoadc auti emed lLuiarr dssi s  l");
        itemMap6.put("string17", "Ls lrmndo,toeri dti,sistdesiirnpst ocuucpt  a  oa mgreuem meodie nasnl");
        itemMap6.put("string18", "m epsdeudotuetsits iomri  aedni eaeou cgm,n dac onli prsrs ron,mitsLtl");
        itemMap6.put("string19", "Leosmpemtognonas ro,el   ,mt iaoduitst r rn duicsptd ieuidesnei lsmcra");
        itemMap6.put("string20", "mttgiLusoemls n dda aom  liiudiocsno toiemrtcese  e repp, tsdn,saiurnr");
        itemMap6.put("string21", "i auaieotd t.  dceaamtrre stseutoutSmsieLu lramrvaa rmlu  ud,ee tmrlikm u nmcedi at nmlrtplaeg.l scuovper su  ssldodtsm taoecLenru pmt uno rtdpatno esattlagalaejo  aomkeecnisoe, t oiyb sn v aeeytdsrAoumispso  it croaue  a,dgi,oaiuds ue mLtneoemegbor o t  oatr std eidsttmnrde nieoe iq  a bme rsr ioo.");
        itemMap6.put("string22", "Ldatttemtdi.aae etuocoarmar ter esmiu i tnum oscle unu a r m  rake  lemsrc,noovgeriuts  tnsli tai iagde ntLmiltinuriotvatu.idovc i Lpt.  eAetug oboamtSeraineoaomarmtuocdu dmsr enacd  pset  e reueigsapektsp,oymt,eob trsoe re ladtqo dnjsdslroso e stamameu ei  y ml utssmeboeoas d ooepdd,sr  r  ll auna ");
        itemMap6.put("string23", "smuretpte   dm d oen od.c Le auam  u tescuaLeng,aira tvl rtroeueceiutdsmSieiressngc bree s,oda Amtred, lounoe  gplaanotl soartrls  iy aiods erkvLrteodpieg taniainuroos putb do s itosselmmrlorduoddm  tos iie tata  no miu utial.c .ommnmrepiymrte,esbuevtka  s  mea edautm qt a  uomettoelt  aotjnecra ass");
        itemMap6.put("string24", " moosooueide mdtu yacadtoreaoi totaiu noa tacmllsrmr tkeaerdae sio rumae oalosrtci ptotrl mirl iuksps,ouerLuau est sm ,oee dte Arnrapsomea d  r sie,n u n n tnmdbme iltsvroodtl tat maunit,em ntes e tiu ed s Si.utoLm.sosagtiadqbp.tgetnm euvear   os sdba iypgadtl n arijmmeuae ccol Ldor grv teuce  s eee");
        itemMap6.put("string25", "sbredqurdigLuseoamsrttoaadLi se  g trmAd  t,ltr .ap e me esssatSdt nm aovia oo ucc ilr pelilonniltanpyoaoiuser altuama t a i e meela rstuepiekrrr csndvmuibo edeeom  s  m asogasga ro m at    mrubadm tttol me toe ,emtrttLr l tuatr ticeonoie sue sdca i .un,couepaeo t knjoeumuotnsdeesd,yevs.otiermdinduo");
        itemMap6.put("string26", "tgi etmtsasdrgt eeaoe  eed.t . tdsrad,veet,isso  lciu  moctqulAm taLur denerreomaraoioouLaieaeimslusetpnbdomuueeoy eeiuuacm  tdnodpr  odpa ousrosSaom t  lss g irmli do m mouonk r trtrceetytip  mapttsicot  os  are beno enmms l soda glikam vltau jetameunstre.s ndaL bnunie tl,rotrasaeu i acdv, r  ait e");
        itemMap6.put("string27", "mtcc slktustLedtutonr imtuepAmgs noautsdti  eg r  e evi  oo olvb oaagoyoraalnieootboomaro,tecisiysouettdsrjttreeu  nin rdte  dpsmm  aoacd rdeemn u ueressrieL. eopi aoelmtid ebl.rucsi mns aanl   a aL  . eeetSdgasimloivmqdmtete, sprdotamu p oeru sm suet  tmaurlaa sntic   u asd, adrierokttlroea nem,ua ");
        itemMap6.put("string28", " ni Ac umgcueoet dieuiussLit esra  ocv  uenm  dscmpeires eeptulnmm , ti.otonoeeniaorlsbonav ded stu   eg emta nrddodd oodtli i imps aietne rmdean otr ayrrndteyeottosa.vemea a coaser raprummuat psrirst r alra , acojtua   ualeosumrakme,atm g omr tia bit Sleaou  siud ttlldstLebs sgLoeoeo  su,otttm.lqke");
        itemMap6.put("string29", "datem.eiitetle, vakipesaetlmy gaiqd    mdom sreocr aes uisooLlaoenistr tmtd nrase u teLsospmeuaotuolsedtaan rogeanllt rAoS, e essrdtmtasucsanatr.drmcrb  u opeamet uienee tmtt ui  sai mol rnnt.mos    ioktduau roday eel  os  tjitLetciemned rm r, dr,oouom pur evgi d aiaeunva bso i ep  rmlctogduubcsot a");
        itemMap6.put("string30", "nmeodu t,mledr tumnamtaeesd ae. La,rm se j osgraeti  uui bamcol  ulaectdsaanutet tsrtses d  dtletsoiSoimlt i eoem  euru.ndn ros  slnadgoysduvuiaco ikmit iye,osmpttlgdp atr e  oeqamuvaooude iiroeo   te mbmcsrptadeooeusmiaons p  ar bo L t e  ltpea.rra goeevn aunsttr,odtL rmaiu etst aelrn crAic kiomers");
        itemMap6.put("number1", 288794);
        itemMap6.put("number2", 790074);
        itemMap6.put("number3", 897076);
        itemMap6.put("number4", 543517);
        itemMap6.put("number5", 879379);
        itemMap6.put("number6", 141326);
        itemMap6.put("number7", 448691);
        itemMap6.put("number8", 273700);
        itemMap6.put("number9", 472840);
        itemMap6.put("number10", 384781);
        itemMap6.put("number11", 15914);
        itemMap6.put("number12", 66174);
        itemMap6.put("number13", 732561);
        itemMap6.put("number14", 280604);
        itemMap6.put("number15", 281772);
        itemMap6.put("number16", 248993);
        itemMap6.put("number17", 21926);
        itemMap6.put("number18", 565175);
        itemMap6.put("number19", 429083);
        itemMap6.put("number20", 890047);
        itemMap6.put("number21", 413817);
        itemMap6.put("number22", 236922);
        itemMap6.put("number23", 146038);
        itemMap6.put("number24", 102289);
        itemMap6.put("number25", 338484);
        itemMap6.put("number26", 716356);
        itemMap6.put("number27", 796573);
        itemMap6.put("number28", 515129);
        itemMap6.put("number29", 887119);
        itemMap6.put("number30", 176757);
        itemMap6.put("number31", 185909);
        itemMap6.put("number32", 425466);
        itemMap6.put("number33", 842974);
        itemMap6.put("number34", 48245);
        itemMap6.put("number35", 169603);
        itemMap6.put("number36", 153994);
        itemMap6.put("number37", 306071);
        itemMap6.put("number38", 753924);
        itemMap6.put("number39", 302437);
        itemMap6.put("number40", 189216);
        itemMap6.put("number41", 644299);
        itemMap6.put("number42", 778636);
        itemMap6.put("number43", 771130);
        itemMap6.put("number44", 46636);
        itemMap6.put("number45", 837506);
        itemMap6.put("number46", 563567);
        itemMap6.put("number47", 30784);
        itemMap6.put("number48", 591160);
        itemMap6.put("number49", 202270);
        itemMap6.put("number50", 558249);
        itemMap6.put("number51", 788709);
        itemMap6.put("number52", 823659);
        itemMap6.put("number53", 969157);
        itemMap6.put("number54", 123726);
        itemMap6.put("number55", 614855);
        itemMap6.put("number56", 104916);
        itemMap6.put("number57", 36238);
        itemMap6.put("number58", 144863);
        itemMap6.put("number59", 792103);
        itemMap6.put("number60", 28039);
        itemMap6.put("number61", -688306);
        itemMap6.put("number62", -197281);
        itemMap6.put("number63", -452147);
        itemMap6.put("number64", -894250);
        itemMap6.put("number65", -311072);
        itemMap6.put("number66", -266047);
        itemMap6.put("number67", -916455);
        itemMap6.put("number68", -196088);
        itemMap6.put("number69", -112284);
        itemMap6.put("number70", -122284);
        itemMap6.put("number71", -963617);
        itemMap6.put("number72", -774047);
        itemMap6.put("number73", -60039);
        itemMap6.put("number74", -871730);
        itemMap6.put("number75", -993099);
        itemMap6.put("number76", -423102);
        itemMap6.put("number77", -959461);
        itemMap6.put("number78", -157485);
        itemMap6.put("number79", -752777);
        itemMap6.put("number80", -544900);
        itemMap6.put("number81", -174418);
        itemMap6.put("number82", -663871);
        itemMap6.put("number83", -426983);
        itemMap6.put("number84", -259448);
        itemMap6.put("number85", -640702);
        itemMap6.put("number86", -691092);
        itemMap6.put("number87", -732581);
        itemMap6.put("number88", -163810);
        itemMap6.put("number89", -167421);
        itemMap6.put("number90", -479161);
        itemMap6.put("number91", -46887);
        itemMap6.put("number92", -867139);
        itemMap6.put("number93", -371880);
        itemMap6.put("number94", -752832);
        itemMap6.put("number95", -332026);
        itemMap6.put("number96", -329664);
        itemMap6.put("number97", -601894);
        itemMap6.put("number98", -479347);
        itemMap6.put("number99", -968611);
        itemMap6.put("number100", -738372);
        itemMap6.put("number101", -992302);
        itemMap6.put("number102", -867538);
        itemMap6.put("number103", -503204);
        itemMap6.put("number104", -787605);
        itemMap6.put("number105", -768844);
        itemMap6.put("number106", -758220);
        itemMap6.put("number107", -850590);
        itemMap6.put("number108", -838875);
        itemMap6.put("number109", -80287);
        itemMap6.put("number110", -437269);
        itemMap6.put("number111", -749995);
        itemMap6.put("number112", -218700);
        itemMap6.put("number113", -619271);
        itemMap6.put("number114", -243049);
        itemMap6.put("number115", -929349);
        itemMap6.put("number116", -96737);
        itemMap6.put("number117", -399475);
        itemMap6.put("number118", -843495);
        itemMap6.put("number119", -229448);
        itemMap6.put("number120", -833711);
        itemMap6.put("number121", 654769265.6793875);
        itemMap6.put("number122", 596981189.2065713);
        itemMap6.put("number123", 153499351.39282668);
        itemMap6.put("number124", 515260421.38562566);
        itemMap6.put("number125", 221758716.59155443);
        itemMap6.put("number126", 186218942.78717166);
        itemMap6.put("number127", 20960544.160306793);
        itemMap6.put("number128", 547806078.6009085);
        itemMap6.put("number129", 490045309.6455622);
        itemMap6.put("number130", 617579743.3309215);
        itemMap6.put("number131", 188073851.82086024);
        itemMap6.put("number132", 725270795.3061088);
        itemMap6.put("number133", 109666443.8621271);
        itemMap6.put("number134", 135727944.16925016);
        itemMap6.put("number135", 363442894.32223034);
        itemMap6.put("number136", 661176162.5280268);
        itemMap6.put("number137", 419495686.5812587);
        itemMap6.put("number138", 47612714.68798356);
        itemMap6.put("number139", 33608485.19984982);
        itemMap6.put("number140", 269468976.40855014);
        itemMap6.put("number141", 578049783.3162317);
        itemMap6.put("number142", 87253337.99805179);
        itemMap6.put("number143", 455315766.87664634);
        itemMap6.put("number144", 430959694.57625884);
        itemMap6.put("number145", 716541838.0825357);
        itemMap6.put("number146", 760720328.3294839);
        itemMap6.put("number147", 108059318.66101848);
        itemMap6.put("number148", 513817989.2550113);
        itemMap6.put("number149", 803245703.4838587);
        itemMap6.put("number150", 141937238.66908604);
        itemMap6.put("number151", 260392638.6736406);
        itemMap6.put("number152", 81653493.52146468);
        itemMap6.put("number153", 737096453.874424);
        itemMap6.put("number154", 134484828.43198407);
        itemMap6.put("number155", 632951984.3776277);
        itemMap6.put("number156", 275810061.7112048);
        itemMap6.put("number157", 737209126.4954703);
        itemMap6.put("number158", 419126491.76253235);
        itemMap6.put("number159", 987951097.7310175);
        itemMap6.put("number160", 620806543.4547538);
        itemMap6.put("number161", 93696944.01645368);
        itemMap6.put("number162", 927757821.5876961);
        itemMap6.put("number163", 381014085.27037793);
        itemMap6.put("number164", 635762715.5661598);
        itemMap6.put("number165", 391468631.6728734);
        itemMap6.put("number166", 252882275.50643894);
        itemMap6.put("number167", 35769703.38568364);
        itemMap6.put("number168", 175543621.31177902);
        itemMap6.put("number169", 71115593.85817856);
        itemMap6.put("number170", 597982441.5008086);
    }
}
