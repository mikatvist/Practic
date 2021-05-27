package Static;



public class CapitalOne {
    public static void main(String[] args) {
        Tester [] testers = {new Tester(),new Tester(), new Tester()};
        testers [0].setInfo("VOVA", 'M', 234, "12345", 100000  );
        testers [1].setInfo("BOBI", 'M', 345, "23456", 120000 );
        testers [2].setInfo("VICTOR", 'F', 345, "345678", 130000);
        Developer[]developers={new  Developer(), new Developer() };
        developers[0].setInfo("waqar", 'M', 2111L, "Dev Lead" , 4500000);
        developers[1].setInfo("roza", 'F', 3222L, "Dev", 550000);
        //System.out.println(testers[0], testers[1], testers[2]);
        Scrum_team  team1 = new Scrum_team();
        team1.setInfo("ULIA", "MArk", "govno");
        team1.addTesters(testers);
        team1.addDevelopers(developers);
        System.out.println(team1);
        System.out.println("====================================================");
        for (Tester each: team1.testers){
            System.out.println("name "+each.name+" salary "+each.salary);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(Developer each : team1.developers){
            System.out.println(each.name + " salary "+ each.salary);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        team1.removeTester(345);
        System.out.println(team1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        Developer dev1 = new Developer();
        dev1.setInfo("mark", 'M', 123,"233456", 2300000);

        team1.addDeveloper(dev1);
        System.out.println(team1);

        System.out.println("=====================================================");




    }


}
