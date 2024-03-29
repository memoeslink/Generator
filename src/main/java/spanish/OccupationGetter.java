package spanish;

import com.memoeslink.common.Randomizer;
import common.Database;
import common.Gender;
import common.OccupationDefiner;
import common.ResourceGetter;
import org.memoeslink.Separator;
import org.memoeslink.StringHelper;

public final class OccupationGetter extends common.OccupationGetter implements OccupationDefiner {
    public static final String FANTASY_CLASS_FORMAT = "%s de nivel %d";

    public OccupationGetter() {
        super();
    }

    public OccupationGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getOccupation() {
        return getOccupation(r.getIntInRange(1, Database.countSpanishOccupations()));
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
    public String getJobPosition() {
        String titleDepartment = ResourceGetter.with(r).getString(Constant.TITLE_DEPARTMENT);
        String titleJob = ResourceGetter.with(r).getString(Constant.TITLE_JOB);
        return String.join(String.valueOf(Separator.SPACE.getCharacter()), titleJob, "de", titleDepartment);
    }

    @Override
    public String getFemaleJobPosition() {
        String title = getJobPosition();
        return TextProcessor.genderify(title, Gender.FEMININE);
    }

    @Override
    public String getMaleJobPosition() {
        String title = getJobPosition();
        return TextProcessor.genderify(title, Gender.MASCULINE);
    }

    @Override
    public String getGenderlessJobPosition() {
        String title = getJobPosition();
        return TextProcessor.genderify(title, Gender.UNDEFINED);
    }

    @Override
    public String getSimpleFantasyClass() {
        String fantasyClass = ResourceGetter.with(r).getSplitString(Constant.CLASSES);
        return StringHelper.capitalizeFirst(fantasyClass);
    }

    @Override
    public String getFemaleSimpleFantasyClass() {
        String fantasyClass = ResourceGetter.with(r).getSplitString(Constant.CLASSES);
        fantasyClass = TextProcessor.genderify(fantasyClass, Gender.FEMININE);
        return StringHelper.capitalizeFirst(fantasyClass);
    }

    @Override
    public String getMaleSimpleFantasyClass() {
        String fantasyClass = ResourceGetter.with(r).getSplitString(Constant.CLASSES);
        fantasyClass = TextProcessor.genderify(fantasyClass, Gender.FEMININE);
        return StringHelper.capitalizeFirst(fantasyClass);
    }

    @Override
    public String getGenderlessSimpleFantasyClass() {
        String fantasyClass = ResourceGetter.with(r).getSplitString(Constant.CLASSES);
        fantasyClass = TextProcessor.genderify(fantasyClass, Gender.UNDEFINED);
        return StringHelper.capitalizeFirst(fantasyClass);
    }

    @Override
    public String getFantasyClass() {
        String fantasyClass = getSimpleFantasyClass();
        int level = r.getInt(1, 100);
        return String.format(FANTASY_CLASS_FORMAT, fantasyClass, level);
    }

    @Override
    public String getFemaleFantasyClass() {
        String fantasyClass = getFemaleSimpleFantasyClass();
        int level = r.getInt(1, 100);
        return String.format(FANTASY_CLASS_FORMAT, fantasyClass, level);
    }

    @Override
    public String getMaleFantasyClass() {
        String fantasyClass = getMaleSimpleFantasyClass();
        int level = r.getInt(1, 100);
        return String.format(FANTASY_CLASS_FORMAT, fantasyClass, level);
    }

    @Override
    public String getGenderlessFantasyClass() {
        String fantasyClass = getGenderlessSimpleFantasyClass();
        int level = r.getInt(1, 100);
        return String.format(FANTASY_CLASS_FORMAT, fantasyClass, level);
    }

    public String getFemaleHonorific() {
        String honorific = ResourceGetter.with(r).getString(Constant.HONORIFICS);
        return english.TextProcessor.genderifyStr(honorific, Gender.FEMININE).getText();
    }

    @Override
    public String getMaleHonorific() {
        String honorific = ResourceGetter.with(r).getString(Constant.HONORIFICS);
        return english.TextProcessor.genderifyStr(honorific, Gender.MASCULINE).getText();
    }

    @Override
    public String getGenderlessHonorific() {
        String honorific = ResourceGetter.with(r).getString(Constant.HONORIFICS);
        return english.TextProcessor.genderifyStr(honorific, Gender.UNDEFINED).getText();
    }

    @Override
    public String getFemaleRoyalTitle() {
        String honorific = ResourceGetter.with(r).getString(Constant.ROYAL_TITLES);
        return english.TextProcessor.genderifyStr(honorific, Gender.FEMININE).getText();
    }

    @Override
    public String getMaleRoyalTitle() {
        String honorific = ResourceGetter.with(r).getString(Constant.ROYAL_TITLES);
        return english.TextProcessor.genderifyStr(honorific, Gender.MASCULINE).getText();
    }

    @Override
    public String getGenderlessRoyalTitle() {
        String honorific = ResourceGetter.with(r).getString(Constant.ROYAL_TITLES);
        return english.TextProcessor.genderifyStr(honorific, Gender.UNDEFINED).getText();
    }
}
