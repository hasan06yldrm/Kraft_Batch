package day48_OOP_Review.ScrumTeam;

public class Spotify {
    public static void main(String[] args) {


        String departmantName = "Spotify";
        ProductOwner po = new ProductOwner("Daghan", 30, 'M', 50000, 321321, departmantName);
        BusinessAnalyst ba = new BusinessAnalyst("Umit", 35, 'M', 45000, 300400, departmantName);
        ScrumMaster sm = new ScrumMaster("Emine", 34, 'F', 42000, 400500, departmantName);
        Tester tester1 = new Tester("Ugur", 30, 'M', 30000, 321456, departmantName, "Java");
        Tester tester2 = new Tester("Ali", 30, 'M', 30000, 321456, departmantName, "Java");
        Tester tester3 = new Tester("Eda", 30, 'M', 30000, 321456, departmantName, "Java");

        Tester[] testers = {tester1, tester2, tester3};

        Developer developer1 = new Developer("Ahmet", 28, 'M', 35000, 654321, departmantName, "Phyton");
        Developer developer2 = new Developer("İsa", 28, 'M', 95000, 654321, departmantName, "JS");
        Developer developer3 = new Developer("Emine", 28, 'M', 15000, 654321, departmantName, "Java");
        Developer developer4 = new Developer("Ziya", 28, 'M', 25000, 654321, departmantName, "Phyton");
        Developer developer5 = new Developer("Nuran", 28, 'M', 45000, 654321, departmantName, "Phyton");

        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer5);
        scrumTeam.addDeveloper(developers);

        scrumTeam.addTester(tester3);
        scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

        System.out.println("---------------------------");
        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name);
            System.out.println(tester.getId());
        }

    }
}
