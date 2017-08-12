package floorswebappjobs;

/**
 * Created by vonclaude on 4/22/2017.
 */
public class Knight extends Job{

    public Knight() {
        name = "\"Knight\"";
        cardURL = "\"image/knight_card.png\"";
        mainHand = "\"Sword\"";
        offHand = "\"Shield\"";
        gear = "\"Armor\"";
        bag = new String[]{"\"-\"", "\"-\"", "\"-\"", "\"-\""};
        ammo = "\"\"";
        innate = "\"Sword Artes\"";
        skills = new String[][]{ {"\"Counter\"", "\"-\""}, {"\"Shield Bash\"", "\"-\""}, {"\"Spin Slash\"","\"-\""}, {"\"Ground Slash\"","\"-\""} };
    }

    protected String convertBagArrayToString() {
        String bagTemplate = "[%1s, %2s, %3s, %4s]";
        bagTemplate = String.format(bagTemplate, bag[0], bag[1], bag[2], bag[3]);
        System.out.println(bagTemplate);

        return bagTemplate;
    }

    protected String convertSkillsArrayToString() {
        String skillsTemplate = "[{\"name\": %1s, \"desc\": %2s}, {\"name\": %3s, \"desc\": %4s}, {\"name\": %5s, \"desc\": %6s}, {\"name\": %7s,\"desc\": %8s}]";
        skillsTemplate = String.format(skillsTemplate, skills[0][0], skills[0][1], skills[1][0], skills[1][1], skills[2][0], skills[2][1], skills[3][0], skills[3][1]);
        System.out.println(skillsTemplate);

        return skillsTemplate;
    }
}
