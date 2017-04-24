package floorswebappjobs;

/**
 * Created by Colin on 4/22/2017.
 */
public abstract class Job {
    protected String name;
    protected String cardURL;
    protected String mainHand;
    protected String offHand;
    protected String gear;
    protected String[] bag;
    protected String ammo;
    protected String innate;
    protected String[][] skills;

    protected abstract String convertBagArrayToString();

    protected abstract String convertSkillsArrayToString();

    public String convertToJSON() {

        String bagString = convertBagArrayToString();
        String skillsString = convertSkillsArrayToString();

        String JSONTemplate = "{ \"name\": %1s, \"cardURL\": %2s, \"mainHand\": %3s, \"offHand\": %4s, \"gear\": %5s, \"bag\": %6s, \"ammo\": %7s, \"innate\": %8s, \"skills\": %9s }";
        JSONTemplate = String.format(JSONTemplate, name, cardURL, mainHand, offHand, gear, bagString, ammo, innate, skillsString);
        System.out.println(JSONTemplate);

        return JSONTemplate;
    }
}
