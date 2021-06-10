package spanish;

import common.*;

public final class OccupationGetter extends common.OccupationGetter implements OccupationDefiner {

    public OccupationGetter() {
        super();
    }

    public OccupationGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getOccupation() {
        return getOccupation(r.getInt(1, Database.countSpanishOccupations()));
    }

    @Override
    public String getOccupation(int id) {
        return Database.selectSpanishOccupation(id);
    }

    @Override
    public String getFemaleOccupation() {
        return TextProcessor.genderify(getOccupation(), Gender.FEMININE);
    }

    @Override
    public String getFemaleOccupation(int id) {
        return TextProcessor.genderify(getOccupation(id), Gender.FEMININE);
    }

    @Override
    public String getMaleOccupation() {
        return TextProcessor.genderify(getOccupation(), Gender.MASCULINE);
    }

    @Override
    public String getMaleOccupation(int id) {
        return TextProcessor.genderify(getOccupation(id), Gender.MASCULINE);

    }

    @Override
    public String getGenderlessOccupation() {
        return TextProcessor.genderify(getOccupation(), Gender.UNDEFINED);

    }

    @Override
    public String getGenderlessOccupation(int id) {
        return TextProcessor.genderify(getOccupation(id), Gender.UNDEFINED);

    }

    @Override
    public String getJobTitle() {
        String titleDescriptor = ResourceGetter.with(r).getString(Constant.TITLE_DESCRIPTOR);
        String titleJob = ResourceGetter.with(r).getString(Constant.TITLE_JOB);
        String titleLevel = ResourceGetter.with(r).getString(Constant.TITLE_LEVEL);
        return String.join(String.valueOf(Separator.SPACE.getCharacter()), titleJob, "de", titleLevel, titleDescriptor);
    }

    @Override
    public String getFemaleJobTitle() {
        String title = getJobTitle();
        return TextProcessor.genderify(title, Gender.FEMININE);
    }

    @Override
    public String getMaleJobTitle() {
        String title = getJobTitle();
        return TextProcessor.genderify(title, Gender.MASCULINE);
    }

    @Override
    public String getGenderlessJobTitle() {
        String title = getJobTitle();
        return TextProcessor.genderify(title, Gender.UNDEFINED);
    }

    @Override
    public String getFantasyClass() {
        String fantasyClass = ResourceGetter.with(r).getSplitString(Constant.CLASSES);
        fantasyClass = StringHelper.capitalizeFirst(fantasyClass);
        int level = r.getInt(1, 99);
        return String.format("%s de nivel %d", fantasyClass, level);
    }

    @Override
    public String getFemaleFantasyClass() {
        String fantasyClass = getFantasyClass();
        return TextProcessor.genderify(fantasyClass, Gender.FEMININE);
    }

    @Override
    public String getMaleFantasyClass() {
        String fantasyClass = getFantasyClass();
        return TextProcessor.genderify(fantasyClass, Gender.MASCULINE);
    }

    @Override
    public String getGenderlessFantasyClass() {
        String fantasyClass = getFantasyClass();
        return TextProcessor.genderify(fantasyClass, Gender.UNDEFINED);
    }
}
