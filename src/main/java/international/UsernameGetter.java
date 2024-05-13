package international;

import com.memoeslink.common.Randomizer;
import common.Database;
import common.ResourceGetter;

public class UsernameGetter extends base.UsernameGetter {

    public UsernameGetter() {
        super();
    }

    public UsernameGetter(Randomizer r) {
        super(r);
    }

    @Override
    public String getUsername() {
        return Database.selectUsername(r.getIntInRange(1, Database.countUsernames()));
    }

    @Override
    public String getCompositeUsername() {
        return getAnyGetter().getCompositeUsername();
    }

    @Override
    public String getDerivedUsername() {
        return getAnyGetter().getDerivedUsername();
    }

    @Override
    public String getPatternUsername() {
        return getAnyGetter().getPatternUsername();
    }

    @Override
    public String getAdminUsername() {
        return r.getInt(10) == 0 ? ResourceGetter.with(r).getSplitString(Constant.ADMIN_USERNAMES) :
                (ResourceGetter.with(r).getSplitString(Constant.ADMIN_USERNAME_EXPERTISE) +
                        ResourceGetter.with(r).getSplitString(Constant.ADMIN_USERNAME_TITLE));
    }

    @Override
    public String getWordBasedUsername() {
        return getAnyGetter().getWordBasedUsername();
    }

    @Override
    public String getAnonymousName() {
        return getAnyGetter().getAnonymousName();
    }

    @Override
    public String getAnonymousAnimal() {
        return getAnyGetter().getAnonymousAnimal();
    }

    public common.UsernameGetter getAnyGetter() {
        return switch (ResourceGetter.with(r).getString(common.Constant.SUPPORTED_LOCALES)) {
            case "en" -> new english.UsernameGetter(r);
            case "es" -> new spanish.UsernameGetter(r);
            default -> new common.UsernameGetter(r);
        };
    }
}
