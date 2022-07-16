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
        itemMap3.put("number1", -773695814);
        itemMap3.put("number2", -898985081);
        itemMap3.put("number3", -1044334578);
        itemMap3.put("number4", 601344882);
        itemMap3.put("number5", -1891750705);
        itemMap3.put("number6", 1912914684);
        itemMap3.put("number7", 783916399);
        itemMap3.put("number8", -747784018);
        itemMap3.put("number9", 187856366);
        itemMap3.put("number10", 1077440403);
        itemMap3.put("number11", 152805479.1988148);
        itemMap3.put("number12", 333466975.2791244);
        itemMap3.put("number13", 690149793.196442);
        itemMap3.put("number14", 541696781.9982349);
        itemMap3.put("number15", 40893216.17970176);
        itemMap3.put("number16", 922618510.9589455);
        itemMap3.put("number17", 697871882.9921261);
        itemMap3.put("number18", 282748185.9513198);
        itemMap3.put("number19", 798845890.8521249);
        itemMap3.put("number20", 819314871.8854578);
    }

    private static void fillItemMap4() {
        itemMap4 = new HashMap<>();
        itemMap4.put("string1", "em ipsum dolor siLor");
        itemMap4.put("string2", "Lorem ipsum dolor si");
        itemMap4.put("string3", "um dolor siLorem ips");
        itemMap4.put("string4", "sum dolor siLorem ip");
        itemMap4.put("string5", "rem ipsum dolor siLo");
        itemMap4.put("string6", "iLorem ipsum dolor s");
        itemMap4.put("string7", "orem ipsum dolor siL");
        itemMap4.put("string8", "m dolor siLorem ipsu");
        itemMap4.put("string9", "m ipsum dolor siLore");
        itemMap4.put("string10", "em ipsum dolor siLor");
        itemMap4.put("string11", "t amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor si");
        itemMap4.put("string12", "g elitr, sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscin");
        itemMap4.put("string13", "iam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed d");
        itemMap4.put("string14", "consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, ");
        itemMap4.put("string15", " sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, consetetur");
        itemMap4.put("string16", " dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum");
        itemMap4.put("string17", "em ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonuLor");
        itemMap4.put("string18", " dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum");
        itemMap4.put("string19", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonu");
        itemMap4.put("string20", "psum dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem i");
    }

    private static void fillItemMap5() {
        itemMap5 = new HashMap<>();
        itemMap5.put("string1", "am nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed di");
        itemMap5.put("string2", ", sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr");
        itemMap5.put("string3", "em ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonuLor");
        itemMap5.put("string4", "m dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsu");
        itemMap5.put("string5", "adipscing elitr, sed diam nonuLorem ipsum dolor sit amet, consetetur s");
        itemMap5.put("string6", "g elitr, sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscin");
        itemMap5.put("string7", "ed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, s");
        itemMap5.put("string8", "etetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet, cons");
        itemMap5.put("string9", "diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ");
        itemMap5.put("string10", "am nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed di");
        itemMap5.put("string11", "ubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd g");
        itemMap5.put("string12", "ed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, s");
        itemMap5.put("string13", "olores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo d");
        itemMap5.put("string14", "met, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit a");
        itemMap5.put("string15", " clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet");
        itemMap5.put("string16", "am voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed di");
        itemMap5.put("string17", "it amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor s");
        itemMap5.put("string18", "agna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore m");
        itemMap5.put("string19", "it amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor s");
        itemMap5.put("string20", ". Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum");
    }

    private static void fillItemMap6() {
        itemMap6 = new HashMap<>();
        itemMap6.put("string1", "em ipsum dolor siLor");
        itemMap6.put("string2", "iLorem ipsum dolor s");
        itemMap6.put("string3", "ipsum dolor siLorem ");
        itemMap6.put("string4", "rem ipsum dolor siLo");
        itemMap6.put("string5", "Lorem ipsum dolor si");
        itemMap6.put("string6", "Lorem ipsum dolor si");
        itemMap6.put("string7", "em ipsum dolor siLor");
        itemMap6.put("string8", " ipsum dolor siLorem");
        itemMap6.put("string9", "rem ipsum dolor siLo");
        itemMap6.put("string10", "dolor siLorem ipsum ");
        itemMap6.put("string11", "litr, sed diam nonuLorem ipsum dolor sit amet, consetetur sadipscing e");
        itemMap6.put("string12", "d diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, se");
        itemMap6.put("string13", "olor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum d");
        itemMap6.put("string14", " nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam");
        itemMap6.put("string15", " nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam");
        itemMap6.put("string16", "diam nonuLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ");
        itemMap6.put("string17", "it amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor s");
        itemMap6.put("string18", " sit amet, consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor");
        itemMap6.put("string19", "ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonuLorem ");
        itemMap6.put("string20", " consetetur sadipscing elitr, sed diam nonuLorem ipsum dolor sit amet,");
        itemMap6.put("string21", "uptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam vol");
        itemMap6.put("string22", "uptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam vol");
        itemMap6.put("string23", "et, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit am");
        itemMap6.put("string24", "t, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam era");
        itemMap6.put("string25", " amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit");
        itemMap6.put("string26", ". LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet");
        itemMap6.put("string27", "etetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, cons");
        itemMap6.put("string28", " LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        itemMap6.put("string29", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lore");
        itemMap6.put("string30", " justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. LoreLorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et");
        itemMap6.put("number1", -7715183);
        itemMap6.put("number2", -1313607451);
        itemMap6.put("number3", 170769934);
        itemMap6.put("number4", 1436950592);
        itemMap6.put("number5", 520052119);
        itemMap6.put("number6", 1361361402);
        itemMap6.put("number7", -798131393);
        itemMap6.put("number8", 849435701);
        itemMap6.put("number9", 1325777190);
        itemMap6.put("number10", -1593315784);
        itemMap6.put("number11", -704890667);
        itemMap6.put("number12", -148336417);
        itemMap6.put("number13", -1751786083);
        itemMap6.put("number14", 375083832);
        itemMap6.put("number15", -391104495);
        itemMap6.put("number16", 1002372388);
        itemMap6.put("number17", 1383338412);
        itemMap6.put("number18", 418965340);
        itemMap6.put("number19", 1005181538);
        itemMap6.put("number20", 397645822);
        itemMap6.put("number21", 294281892);
        itemMap6.put("number22", 1173236924);
        itemMap6.put("number23", 907758932);
        itemMap6.put("number24", -170467653);
        itemMap6.put("number25", 239890440);
        itemMap6.put("number26", -1447940289);
        itemMap6.put("number27", 541449348);
        itemMap6.put("number28", -1983496200);
        itemMap6.put("number29", 1469191233);
        itemMap6.put("number30", -1504633571);
        itemMap6.put("number31", -102940845);
        itemMap6.put("number32", -1463343113);
        itemMap6.put("number33", 831221963);
        itemMap6.put("number34", 1353402161);
        itemMap6.put("number35", -895664605);
        itemMap6.put("number36", -961452788);
        itemMap6.put("number37", -108830480);
        itemMap6.put("number38", -980143954);
        itemMap6.put("number39", -1493076844);
        itemMap6.put("number40", 493931799);
        itemMap6.put("number41", -870229986);
        itemMap6.put("number42", 1882741089);
        itemMap6.put("number43", 1118750576);
        itemMap6.put("number44", -387417272);
        itemMap6.put("number45", -1194268238);
        itemMap6.put("number46", 1330995292);
        itemMap6.put("number47", 1909046775);
        itemMap6.put("number48", 1217483010);
        itemMap6.put("number49", 681862867);
        itemMap6.put("number50", 2055526996);
        itemMap6.put("number51", 1017541257);
        itemMap6.put("number52", 1752702516);
        itemMap6.put("number53", 2124738862);
        itemMap6.put("number54", -280885464);
        itemMap6.put("number55", -1288395531);
        itemMap6.put("number56", 435745511);
        itemMap6.put("number57", -371416256);
        itemMap6.put("number58", -585835016);
        itemMap6.put("number59", -2142289477);
        itemMap6.put("number60", -2072054426);
        itemMap6.put("number61", 2070508493);
        itemMap6.put("number62", 1226320824);
        itemMap6.put("number63", -966847351);
        itemMap6.put("number64", -2009286386);
        itemMap6.put("number65", -766720094);
        itemMap6.put("number66", -666036028);
        itemMap6.put("number67", 1671870518);
        itemMap6.put("number68", 1185518270);
        itemMap6.put("number69", 427894957);
        itemMap6.put("number70", -1093290751);
        itemMap6.put("number71", 572069897);
        itemMap6.put("number72", -365892566);
        itemMap6.put("number73", -1558042981);
        itemMap6.put("number74", 1348341234);
        itemMap6.put("number75", 1480096974);
        itemMap6.put("number76", -1260269701);
        itemMap6.put("number77", -389043482);
        itemMap6.put("number78", 1212698086);
        itemMap6.put("number79", 1976414954);
        itemMap6.put("number80", -426224559);
        itemMap6.put("number81", 665561167);
        itemMap6.put("number82", -1567783510);
        itemMap6.put("number83", 574808701);
        itemMap6.put("number84", 124135092);
        itemMap6.put("number85", -1957863512);
        itemMap6.put("number86", 1513105903);
        itemMap6.put("number87", -674446989);
        itemMap6.put("number88", -1612006025);
        itemMap6.put("number89", 379352190);
        itemMap6.put("number90", 1419470341);
        itemMap6.put("number91", -300314399);
        itemMap6.put("number92", 929310361);
        itemMap6.put("number93", 76884080);
        itemMap6.put("number94", 1342459067);
        itemMap6.put("number95", 1124931534);
        itemMap6.put("number96", -2063211832);
        itemMap6.put("number97", 219023912);
        itemMap6.put("number98", -892906989);
        itemMap6.put("number99", -1442945814);
        itemMap6.put("number100", -1513751496);
        itemMap6.put("number101", 1550971078);
        itemMap6.put("number102", 601077884);
        itemMap6.put("number103", 1849015315);
        itemMap6.put("number104", -549471410);
        itemMap6.put("number105", -529213173);
        itemMap6.put("number106", 1094822778);
        itemMap6.put("number107", 214953154);
        itemMap6.put("number108", -31571356);
        itemMap6.put("number109", 1565633705);
        itemMap6.put("number110", 498366151);
        itemMap6.put("number111", -1499599444);
        itemMap6.put("number112", -2057851577);
        itemMap6.put("number113", -281471358);
        itemMap6.put("number114", 2111569697);
        itemMap6.put("number115", -1291646862);
        itemMap6.put("number116", -433747270);
        itemMap6.put("number117", -314731420);
        itemMap6.put("number118", -823381812);
        itemMap6.put("number119", 1268117481);
        itemMap6.put("number120", 701497793);
        itemMap6.put("number121", 920791963.0930443);
        itemMap6.put("number122", 805052665.9621463);
        itemMap6.put("number123", 984936070.6999465);
        itemMap6.put("number124", 555817796.1202856);
        itemMap6.put("number125", 925157798.8677753);
        itemMap6.put("number126", 229721757.33402365);
        itemMap6.put("number127", 384602947.55825865);
        itemMap6.put("number128", 143605114.5378241);
        itemMap6.put("number129", 347737346.56367725);
        itemMap6.put("number130", 301014317.7281407);
        itemMap6.put("number131", 807283667.4660548);
        itemMap6.put("number132", 44546624.451087594);
        itemMap6.put("number133", 916916743.2483064);
        itemMap6.put("number134", 606347664.6904668);
        itemMap6.put("number135", 67228520.39562899);
        itemMap6.put("number136", 75517326.59005506);
        itemMap6.put("number137", 789102170.9559553);
        itemMap6.put("number138", 413779381.5040853);
        itemMap6.put("number139", 696367170.31262);
        itemMap6.put("number140", 833228973.0339136);
        itemMap6.put("number141", 21022831.069918092);
        itemMap6.put("number142", 580437262.0452915);
        itemMap6.put("number143", 926850768.0862085);
        itemMap6.put("number144", 158799709.19799092);
        itemMap6.put("number145", 341559030.6592514);
        itemMap6.put("number146", 636281134.001545);
        itemMap6.put("number147", 935658590.6197006);
        itemMap6.put("number148", 592651726.0625161);
        itemMap6.put("number149", 959325841.0841535);
        itemMap6.put("number150", 255928022.38080803);
        itemMap6.put("number151", 274884313.51801866);
        itemMap6.put("number152", 39982707.54000843);
        itemMap6.put("number153", 841482150.0869896);
        itemMap6.put("number154", 382817429.1714674);
        itemMap6.put("number155", 368825660.8795033);
        itemMap6.put("number156", 225242198.0004242);
        itemMap6.put("number157", 404016671.82378453);
        itemMap6.put("number158", 851038734.2567751);
        itemMap6.put("number159", 147079812.82925874);
        itemMap6.put("number160", 340783659.2087983);
        itemMap6.put("number161", 13937905.78050147);
        itemMap6.put("number162", 928044274.2050475);
        itemMap6.put("number163", 481896942.26455283);
        itemMap6.put("number164", 616673150.4375772);
        itemMap6.put("number165", 808426141.9960697);
        itemMap6.put("number166", 290381837.27535635);
        itemMap6.put("number167", 341448198.74094415);
        itemMap6.put("number168", 3722868.1236298745);
        itemMap6.put("number169", 555973934.9245895);
        itemMap6.put("number170", 962821862.5402312);
    }
}
