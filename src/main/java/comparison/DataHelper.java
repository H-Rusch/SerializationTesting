package comparison;

import java.util.HashMap;
import java.util.Map;

public class DataHelper {

    // map of 10 values. Mainly numeric values but also some Strings.
    private static Map<String, Object> itemMap1;
    // map of 10 attributes. Mainly Strings, but also some numeric values.
    private static Map<String, Object> itemMap2;
    // map of 20 attributes consisting only of short and medium-sized strings
    private static Map<String, Object> itemMap3;
    // map of 20 attributes consisting only of medium-sized and long strings
    private static Map<String, Object> itemMap4;
    // map of 200 attributes. Mainly numeric values, but also Strings of varying length
    private static Map<String, Object> itemMap5;

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

    private static void fillItemMap1() {
        itemMap1 = new HashMap<>();
        itemMap1.put("string1", "r siLorem ipsum dolo");
        itemMap1.put("string2", "or siLorem ipsum dol");
        itemMap1.put("number1", 1534917788);
        itemMap1.put("number2", 410298825);
        itemMap1.put("number3", -1726011359);
        itemMap1.put("number4", -1980223427);
        itemMap1.put("number5", 438548863.92037);
        itemMap1.put("number6", 253077190.46724352);
        itemMap1.put("number7", 587879416.8211371);
        itemMap1.put("number8", 930713818.1374322);
    }

    private static void fillItemMap2() {
        itemMap2 = new HashMap<>();
        itemMap2.put("number1", 732355662.3699012);
        itemMap2.put("number2", 58243116.378653646);
        itemMap2.put("string1", " ipsum dolor siLorem");
        itemMap2.put("string2", "lor siLorem ipsum do");
        itemMap2.put("string3", "lor siLorem ipsum do");
        itemMap2.put("string4", " dolor siLorem ipsum");
        itemMap2.put("string5", "or siLorem ipsum dol");
        itemMap2.put("string6", " ipsum dolor siLorem");
        itemMap2.put("string7", "rem ipsum dolor siLo");
        itemMap2.put("string8", "m ipsum dolor siLore");

    }

    private static void fillItemMap3() {
        itemMap3 = new HashMap<>();
        itemMap3.put("string1", "m dolor siLorem ipsu");
        itemMap3.put("string2", "psum dolor siLorem i");
        itemMap3.put("string3", "r siLorem ipsum dolo");
        itemMap3.put("string4", "psum dolor siLorem i");
        itemMap3.put("string5", "um dolor siLorem ips");
        itemMap3.put("string6", "psum dolor siLorem i");
        itemMap3.put("string7", "ipsum dolor siLorem ");
        itemMap3.put("string8", "dolor siLorem ipsum ");
        itemMap3.put("string9", "ipsum dolor siLorem ");
        itemMap3.put("string10", "Lorem ipsum dolor si");
        itemMap3.put("string11", "litr, sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing e");
        itemMap3.put("string12", "sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, ");
        itemMap3.put("string13", "nuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam no");
        itemMap3.put("string14", "dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum ");
        itemMap3.put("string15", "amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit ");
        itemMap3.put("string16", "tur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, consete");
        itemMap3.put("string17", "tr, sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing eli");
        itemMap3.put("string18", "am nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed di");
        itemMap3.put("string19", "orem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonuL");
        itemMap3.put("string20", "t amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor si");
    }

    private static void fillItemMap4() {
        itemMap4 = new HashMap<>();
        itemMap4.put("string1", ", sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr");
        itemMap4.put("string2", "r, sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elit");
        itemMap4.put("string3", "t, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit ame");
        itemMap4.put("string4", "r sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolo");
        itemMap4.put("string5", " consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet,");
        itemMap4.put("string6", "dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum ");
        itemMap4.put("string7", "ur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, consetet");
        itemMap4.put("string8", "em ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonuLor");
        itemMap4.put("string9", "r sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, consetetu");
        itemMap4.put("string10", "r, sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elit");
        itemMap4.put("string11", " gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd");
        itemMap4.put("string12", "akimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea t");
        itemMap4.put("string13", "por invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tem");
        itemMap4.put("string14", "lita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet c");
        itemMap4.put("string15", "ore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dol");
        itemMap4.put("string16", "re et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labo");
        itemMap4.put("string17", " diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed");
        itemMap4.put("string18", " et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos");
        itemMap4.put("string19", ". LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet");
        itemMap4.put("string20", ". At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua");
    }

    private static void fillItemMap5() {
        itemMap5 = new HashMap<>();
        itemMap5.put("string1", "or siLorem ipsum dol");
        itemMap5.put("string2", "Lorem ipsum dolor si");
        itemMap5.put("string3", "iLorem ipsum dolor s");
        itemMap5.put("string4", "m dolor siLorem ipsu");
        itemMap5.put("string5", "em ipsum dolor siLor");
        itemMap5.put("string6", "iLorem ipsum dolor s");
        itemMap5.put("string7", "ipsum dolor siLorem ");
        itemMap5.put("string8", " dolor siLorem ipsum");
        itemMap5.put("string9", "em ipsum dolor siLor");
        itemMap5.put("string10", "um dolor siLorem ips");
        itemMap5.put("string11", "r sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolo");
        itemMap5.put("string12", "tetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, conse");
        itemMap5.put("string13", "cing elitr, sed diam nonuLorem ipsum dolor sit amet, consetetur sadips");
        itemMap5.put("string14", "setetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, con");
        itemMap5.put("string15", "ed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, s");
        itemMap5.put("string16", " sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, consetetur");
        itemMap5.put("string17", "etur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, conset");
        itemMap5.put("string18", "diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ");
        itemMap5.put("string19", " dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum");
        itemMap5.put("string20", "sum dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ip");
        itemMap5.put("string21", "rgren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gube");
        itemMap5.put("string22", "itr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing el");
        itemMap5.put("string23", " gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd");
        itemMap5.put("string24", "tet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. S");
        itemMap5.put("string25", " et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam");
        itemMap5.put("string26", " et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam");
        itemMap5.put("string27", " vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At");
        itemMap5.put("string28", "gren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd guber");
        itemMap5.put("string29", ". At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua");
        itemMap5.put("string30", " LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        itemMap5.put("number1", -388283737);
        itemMap5.put("number2", 1616302830);
        itemMap5.put("number3", 1152194236);
        itemMap5.put("number4", 1265496595);
        itemMap5.put("number5", -505541512);
        itemMap5.put("number6", 2011279976);
        itemMap5.put("number7", 1110528670);
        itemMap5.put("number8", 1578329368);
        itemMap5.put("number9", 1565284141);
        itemMap5.put("number10", -1886999738);
        itemMap5.put("number11", -43056692);
        itemMap5.put("number12", 430333809);
        itemMap5.put("number13", 1082482741);
        itemMap5.put("number14", 1480382737);
        itemMap5.put("number15", 1889526150);
        itemMap5.put("number16", 2130122516);
        itemMap5.put("number17", 873475709);
        itemMap5.put("number18", -1427595805);
        itemMap5.put("number19", -2014424858);
        itemMap5.put("number20", -1050865836);
        itemMap5.put("number21", -278214297);
        itemMap5.put("number22", 213149289);
        itemMap5.put("number23", 1030449064);
        itemMap5.put("number24", 1499741889);
        itemMap5.put("number25", -1361312677);
        itemMap5.put("number26", -1474739918);
        itemMap5.put("number27", -1773449667);
        itemMap5.put("number28", -1787206938);
        itemMap5.put("number29", -252298069);
        itemMap5.put("number30", 680593954);
        itemMap5.put("number31", -1874986577);
        itemMap5.put("number32", -299875601);
        itemMap5.put("number33", -1119065218);
        itemMap5.put("number34", -1493995871);
        itemMap5.put("number35", 963297025);
        itemMap5.put("number36", -345178757);
        itemMap5.put("number37", -1590848980);
        itemMap5.put("number38", 1944543616);
        itemMap5.put("number39", -19684042);
        itemMap5.put("number40", -166892083);
        itemMap5.put("number41", 2011559743);
        itemMap5.put("number42", 184974774);
        itemMap5.put("number43", 666756173);
        itemMap5.put("number44", -1612496068);
        itemMap5.put("number45", -88610657);
        itemMap5.put("number46", -850078743);
        itemMap5.put("number47", -238415716);
        itemMap5.put("number48", 1635216439);
        itemMap5.put("number49", -1865426466);
        itemMap5.put("number50", 1931867882);
        itemMap5.put("number51", -1891457868);
        itemMap5.put("number52", -630457435);
        itemMap5.put("number53", 621342519);
        itemMap5.put("number54", 2091410551);
        itemMap5.put("number55", -865588369);
        itemMap5.put("number56", -121112437);
        itemMap5.put("number57", -1450598188);
        itemMap5.put("number58", 1296629175);
        itemMap5.put("number59", -1008900865);
        itemMap5.put("number60", 1142030925);
        itemMap5.put("number61", -1895310629);
        itemMap5.put("number62", 495962817);
        itemMap5.put("number63", 1752881459);
        itemMap5.put("number64", 1260458154);
        itemMap5.put("number65", -839218991);
        itemMap5.put("number66", -1010787918);
        itemMap5.put("number67", -1251562839);
        itemMap5.put("number68", -1296611923);
        itemMap5.put("number69", 507964097);
        itemMap5.put("number70", -624232533);
        itemMap5.put("number71", -808069805);
        itemMap5.put("number72", -1560451691);
        itemMap5.put("number73", 1581531605);
        itemMap5.put("number74", -1091044198);
        itemMap5.put("number75", 1176918166);
        itemMap5.put("number76", 618638683);
        itemMap5.put("number77", -1360072791);
        itemMap5.put("number78", 650718050);
        itemMap5.put("number79", 33594609);
        itemMap5.put("number80", -874470138);
        itemMap5.put("number81", 1655490123);
        itemMap5.put("number82", -774092444);
        itemMap5.put("number83", 160197999);
        itemMap5.put("number84", -1620556891);
        itemMap5.put("number85", 633829614);
        itemMap5.put("number86", -779223364);
        itemMap5.put("number87", 1142467421);
        itemMap5.put("number88", -2005748400);
        itemMap5.put("number89", -999448905);
        itemMap5.put("number90", 1446225903);
        itemMap5.put("number91", -1858645635);
        itemMap5.put("number92", -1758387897);
        itemMap5.put("number93", -1542871617);
        itemMap5.put("number94", -947623694);
        itemMap5.put("number95", 780133273);
        itemMap5.put("number96", 1131834454);
        itemMap5.put("number97", 1181442684);
        itemMap5.put("number98", 2075415304);
        itemMap5.put("number99", -1064112812);
        itemMap5.put("number100", -2099125672);
        itemMap5.put("number101", 714273889);
        itemMap5.put("number102", -247107643);
        itemMap5.put("number103", -1626502549);
        itemMap5.put("number104", -807290692);
        itemMap5.put("number105", -278224945);
        itemMap5.put("number106", 826844319);
        itemMap5.put("number107", 1911641969);
        itemMap5.put("number108", -124799891);
        itemMap5.put("number109", 769381327);
        itemMap5.put("number110", -1072509686);
        itemMap5.put("number111", -117694433);
        itemMap5.put("number112", -2099719911);
        itemMap5.put("number113", -82404823);
        itemMap5.put("number114", 772882251);
        itemMap5.put("number115", -1359202113);
        itemMap5.put("number116", 394038786);
        itemMap5.put("number117", -1590967141);
        itemMap5.put("number118", 389125197);
        itemMap5.put("number119", 1939993512);
        itemMap5.put("number120", 1300919503);
        itemMap5.put("number121", 986727968.3297956);
        itemMap5.put("number122", 990862242.0087436);
        itemMap5.put("number123", 816818204.8154463);
        itemMap5.put("number124", 112784125.67832741);
        itemMap5.put("number125", 211097282.2975672);
        itemMap5.put("number126", 825760334.6039202);
        itemMap5.put("number127", 65354700.00675403);
        itemMap5.put("number128", 191378245.96459007);
        itemMap5.put("number129", 335705229.0680138);
        itemMap5.put("number130", 164347689.82146454);
        itemMap5.put("number131", 895235739.8156732);
        itemMap5.put("number132", 384977487.9680966);
        itemMap5.put("number133", 814864037.7779164);
        itemMap5.put("number134", 274282315.6857944);
        itemMap5.put("number135", 333422057.0504016);
        itemMap5.put("number136", 475520702.0942858);
        itemMap5.put("number137", 379506235.2753644);
        itemMap5.put("number138", 943167050.5787647);
        itemMap5.put("number139", 703759261.8364849);
        itemMap5.put("number140", 174194484.27848205);
        itemMap5.put("number141", 439987645.18744224);
        itemMap5.put("number142", 738718405.7907636);
        itemMap5.put("number143", 604270419.6963505);
        itemMap5.put("number144", 836028349.8944091);
        itemMap5.put("number145", 107534594.03623533);
        itemMap5.put("number146", 819147454.1711873);
        itemMap5.put("number147", 888277307.1054368);
        itemMap5.put("number148", 183947440.3003708);
        itemMap5.put("number149", 40394158.80430519);
        itemMap5.put("number150", 246081642.04542172);
        itemMap5.put("number151", 997082721.651932);
        itemMap5.put("number152", 208493388.67509827);
        itemMap5.put("number153", 733140236.4458066);
        itemMap5.put("number154", 549415273.3371226);
        itemMap5.put("number155", 886994061.0148213);
        itemMap5.put("number156", 830738847.2650111);
        itemMap5.put("number157", 192164348.30862838);
        itemMap5.put("number158", 300787327.547053);
        itemMap5.put("number159", 463869462.2703048);
        itemMap5.put("number160", 580578282.8658079);
        itemMap5.put("number161", 906816961.9728204);
        itemMap5.put("number162", 411364133.8967603);
        itemMap5.put("number163", 172157206.65813938);
        itemMap5.put("number164", 810866633.9076016);
        itemMap5.put("number165", 13921043.406698752);
        itemMap5.put("number166", 350126719.229553);
        itemMap5.put("number167", 337619167.25880545);
        itemMap5.put("number168", 226974737.02110326);
        itemMap5.put("number169", 768011382.2457682);
        itemMap5.put("number170", 93686839.64462921);
    }
}
