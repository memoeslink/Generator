package spanish;

import common.*;

public final class OccupationGetter extends common.OccupationGetter implements OccupationDefiner {

    public OccupationGetter() {
        super();
    }

    private OccupationGetter(Randomizer r) {
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
        Word occupation = TextProcessor.getFirstSeveredWord(getOccupation());
        return occupation.getFeminineForm();
    }

    @Override
    public String getFemaleOccupation(int id) {
        Word occupation = TextProcessor.getFirstSeveredWord(getOccupation(id));
        return occupation.getFeminineForm();
    }

    @Override
    public String getMaleOccupation() {
        Word occupation = TextProcessor.getFirstSeveredWord(getOccupation());
        return occupation.getMasculineForm();
    }

    @Override
    public String getMaleOccupation(int id) {
        Word occupation = TextProcessor.getFirstSeveredWord(getOccupation(id));
        return occupation.getMasculineForm();
    }

    @Override
    public String getGenderlessOccupation() {
        Word occupation = TextProcessor.getFirstSeveredWord(getOccupation());
        return occupation.getCombinedForm(WordCombination.ONLY_SLASH);
    }

    @Override
    public String getGenderlessOccupation(int id) {
        Word occupation = TextProcessor.getFirstSeveredWord(getOccupation(id));
        return occupation.getCombinedForm(WordCombination.ONLY_SLASH);
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
        return TextProcessor.genderify(title, Gender.NEUTRAL);
    }

    @Override
    public OccupationGetter with(Randomizer r) {
        return new OccupationGetter(r);
    }
}
