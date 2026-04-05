package base;

import com.memoeslink.common.WeightedItem;

public final class Constant {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String VOWELS = "aeiouAEIOU";
    public static final String LOWERCASE_VOWELS = "aeiou";
    public static final String UPPERCASE_VOWELS = "AEIOU";
    public static final String CONSONANTS = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
    public static final String LOWERCASE_CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    public static final String UPPERCASE_CONSONANTS = "BCDFGHJKLMNPQRSTVWXYZ";
    public static final char[] LOWERCASE_ENDING_CONSONANTS = {'l', 'm', 'n', 'r', 's', 't', 'z'};
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] WEIGHTED_CONSONANTS = new WeightedItem[]{
            new WeightedItem<>('b', 0.25D),
            new WeightedItem<>('c', 0.3D),
            new WeightedItem<>('d', 0.25D),
            new WeightedItem<>('f', 0.25D),
            new WeightedItem<>('g', 0.225D),
            new WeightedItem<>('h', 0.075D),
            new WeightedItem<>('j', 0.225D),
            new WeightedItem<>('k', 0.075D),
            new WeightedItem<>('l', 0.3D),
            new WeightedItem<>('m', 0.3D),
            new WeightedItem<>('n', 0.3D),
            new WeightedItem<>('p', 0.25D),
            new WeightedItem<>('q', 0.05D),
            new WeightedItem<>('r', 0.3D),
            new WeightedItem<>('s', 0.4D),
            new WeightedItem<>('t', 0.3D),
            new WeightedItem<>('v', 0.075D),
            new WeightedItem<>('w', 0.05D),
            new WeightedItem<>('x', 0.05D),
            new WeightedItem<>('y', 0.075D),
            new WeightedItem<>('z', 0.075D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] AFRIKAANS_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('e', 0.17821D),
            new WeightedItem<>('i', 0.0845D),
            new WeightedItem<>('n', 0.0807D),
            new WeightedItem<>('a', 0.0795D),
            new WeightedItem<>('s', 0.06898D),
            new WeightedItem<>('r', 0.06518D),
            new WeightedItem<>('o', 0.05887D),
            new WeightedItem<>('d', 0.05767D),
            new WeightedItem<>('t', 0.05747D),
            new WeightedItem<>('l', 0.04035D),
            new WeightedItem<>('g', 0.03584D),
            new WeightedItem<>('k', 0.03074D),
            new WeightedItem<>('v', 0.02273D),
            new WeightedItem<>('u', 0.02253D),
            new WeightedItem<>('m', 0.02183D),
            new WeightedItem<>('w', 0.01872D),
            new WeightedItem<>('h', 0.01682D),
            new WeightedItem<>('b', 0.01602D),
            new WeightedItem<>('p', 0.01482D),
            new WeightedItem<>('y', 0.00991D),
            new WeightedItem<>('f', 0.00801D),
            new WeightedItem<>('j', 0.0032D),
            new WeightedItem<>('c', 0.003D),
            //new WeightedItem<>('ë', 0.0018D),
            //new WeightedItem<>('ê', 0.0008D),
            //new WeightedItem<>('é', 0.0005D),
            new WeightedItem<>('z', 0.0004D),
            //new WeightedItem<>('ï', 0.0002D),
            new WeightedItem<>('x', 0.0002D),
            //new WeightedItem<>('è', 0.0001D),
            //new WeightedItem<>('î', 0.0001D),
            //new WeightedItem<>('ô', 0.0001D),
            new WeightedItem<>('q', 0.0001D),
            //new WeightedItem<>('û', 0.0001D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] ENGLISH_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('e', 0.11051D),
            new WeightedItem<>('t', 0.09258D),
            new WeightedItem<>('a', 0.08407D),
            new WeightedItem<>('r', 0.07506D),
            new WeightedItem<>('i', 0.07466D),
            new WeightedItem<>('o', 0.07426D),
            new WeightedItem<>('n', 0.06674D),
            new WeightedItem<>('a', 0.06258D),
            new WeightedItem<>('h', 0.0603D),
            new WeightedItem<>('d', 0.04208D),
            new WeightedItem<>('l', 0.03981D),
            new WeightedItem<>('u', 0.02723D),
            new WeightedItem<>('w', 0.02535D),
            new WeightedItem<>('m', 0.02376D),
            new WeightedItem<>('f', 0.02198D),
            new WeightedItem<>('c', 0.02178D),
            new WeightedItem<>('g', 0.0199D),
            new WeightedItem<>('y', 0.0197D),
            new WeightedItem<>('p', 0.01901D),
            new WeightedItem<>('b', 0.01475D),
            new WeightedItem<>('k', 0.01277D),
            new WeightedItem<>('v', 0.0096D),
            new WeightedItem<>('j', 0.00149D),
            new WeightedItem<>('x', 0.00149D),
            new WeightedItem<>('q', 0.00089D),
            new WeightedItem<>('z', 0.00069D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] GREEK_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('a', 0.1219D),
            new WeightedItem<>('i', 0.1115D),
            new WeightedItem<>('o', 0.0989D),
            new WeightedItem<>('e', 0.0863D),
            new WeightedItem<>('n', 0.0796D),
            new WeightedItem<>('t', 0.0747D),
            new WeightedItem<>('s', 0.0691D),
            new WeightedItem<>('r', 0.0596D),
            new WeightedItem<>('k', 0.0469D),
            new WeightedItem<>('p', 0.0443D),
            new WeightedItem<>('l', 0.0388D),
            new WeightedItem<>('m', 0.0361D),
            new WeightedItem<>('u', 0.0312D),
            new WeightedItem<>('d', 0.0289D),
            new WeightedItem<>('h', 0.0241D),
            new WeightedItem<>('g', 0.0184D),
            new WeightedItem<>('v', 0.0128D),
            new WeightedItem<>('f', 0.0074D),
            new WeightedItem<>('z', 0.0053D),
            new WeightedItem<>('x', 0.0042D),
            new WeightedItem<>('b', 0.0041D),
            new WeightedItem<>('y', 0.0032D),
            new WeightedItem<>('c', 0.0012D),
            new WeightedItem<>('j', 0.0009D),
            new WeightedItem<>('w', 0.0008D),
            new WeightedItem<>('q', 0.0002D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] HAWAIIAN_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('a', 0.2151D),
            new WeightedItem<>('i', 0.1372D),
            new WeightedItem<>('o', 0.1142D),
            new WeightedItem<>('e', 0.0981D),
            new WeightedItem<>('u', 0.0794D),
            new WeightedItem<>('k', 0.0924D),
            new WeightedItem<>('l', 0.0712D),
            new WeightedItem<>('n', 0.0631D),
            new WeightedItem<>('h', 0.0512D),
            new WeightedItem<>('m', 0.0421D),
            new WeightedItem<>('p', 0.0231D),
            new WeightedItem<>('w', 0.0129D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] LATIN_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('i', 0.11441D),
            new WeightedItem<>('e', 0.11381D),
            new WeightedItem<>('a', 0.08891D),
            new WeightedItem<>('u', 0.08461D),
            new WeightedItem<>('t', 0.08001D),
            new WeightedItem<>('s', 0.07601D),
            new WeightedItem<>('r', 0.06671D),
            new WeightedItem<>('n', 0.06281D),
            new WeightedItem<>('o', 0.05401D),
            new WeightedItem<>('m', 0.05381D),
            new WeightedItem<>('c', 0.0399D),
            new WeightedItem<>('l', 0.0315D),
            new WeightedItem<>('p', 0.0303D),
            new WeightedItem<>('d', 0.0277D),
            new WeightedItem<>('b', 0.0158D),
            new WeightedItem<>('q', 0.0151D),
            new WeightedItem<>('g', 0.0121D),
            new WeightedItem<>('v', 0.0095D),
            new WeightedItem<>('f', 0.0092D),
            new WeightedItem<>('h', 0.0069D),
            new WeightedItem<>('x', 0.006D),
            new WeightedItem<>('y', 0.0007D),
            new WeightedItem<>('k', 0.0001D),
            new WeightedItem<>('z', 0.00005D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] MARSHALLESE_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('o', 0.12873D),
            new WeightedItem<>('e', 0.12022D),
            new WeightedItem<>('n', 0.11522D),
            new WeightedItem<>('a', 0.0994D),
            new WeightedItem<>('i', 0.09369D),
            new WeightedItem<>('k', 0.09359D),
            new WeightedItem<>('j', 0.07287D),
            new WeightedItem<>('m', 0.06076D),
            new WeightedItem<>('r', 0.06046D),
            new WeightedItem<>('l', 0.05015D),
            new WeightedItem<>('b', 0.03023D),
            new WeightedItem<>('w', 0.02813D),
            new WeightedItem<>('t', 0.02242D),
            new WeightedItem<>('u', 0.01822D),
            new WeightedItem<>('d', 0.0033D),
            new WeightedItem<>('p', 0.0016D),
            new WeightedItem<>('s', 0.0006D),
            new WeightedItem<>('y', 0.0003D),
            new WeightedItem<>('v', 0.0001D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] SPANISH_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('e', 0.1372D),
            new WeightedItem<>('a', 0.1172D),
            new WeightedItem<>('o', 0.0844D),
            new WeightedItem<>('s', 0.072D),
            new WeightedItem<>('n', 0.0683D),
            new WeightedItem<>('r', 0.0641D),
            new WeightedItem<>('i', 0.0528D),
            new WeightedItem<>('l', 0.0524D),
            new WeightedItem<>('d', 0.0467D),
            new WeightedItem<>('t', 0.046D),
            new WeightedItem<>('u', 0.0455D),
            new WeightedItem<>('c', 0.0387D),
            new WeightedItem<>('m', 0.0308D),
            new WeightedItem<>('p', 0.0289D),
            new WeightedItem<>('b', 0.0149D),
            new WeightedItem<>('h', 0.0118D),
            new WeightedItem<>('q', 0.0111D),
            new WeightedItem<>('y', 0.0109D),
            new WeightedItem<>('v', 0.0105D),
            new WeightedItem<>('g', 0.01D),
            //new WeightedItem<>('ó', 0.0076D),
            //new WeightedItem<>('í', 0.007D),
            new WeightedItem<>('f', 0.0069D),
            new WeightedItem<>('j', 0.0052D),
            new WeightedItem<>('z', 0.0047D),
            //new WeightedItem<>('á', 0.0044D),
            //new WeightedItem<>('é', 0.0036D),
            new WeightedItem<>('ñ', 0.0017D),
            new WeightedItem<>('x', 0.0014D),
            //new WeightedItem<>('ú', 0.0012D),
            new WeightedItem<>('k', 0.0011D),
            new WeightedItem<>('w', 0.0004D),
            //new WeightedItem<>('ü', 0.0002D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[] WELSH_WEIGHTED_LETTERS = new WeightedItem[]{
            new WeightedItem<>('a', 0.1099D),
            new WeightedItem<>('e', 0.0969D),
            new WeightedItem<>('i', 0.0923D),
            new WeightedItem<>('n', 0.0862D),
            new WeightedItem<>('o', 0.0784D),
            new WeightedItem<>('r', 0.0754D),
            new WeightedItem<>('d', 0.0642D),
            new WeightedItem<>('y', 0.0612D),
            new WeightedItem<>('w', 0.0524D),
            new WeightedItem<>('l', 0.0498D),
            new WeightedItem<>('g', 0.0413D),
            new WeightedItem<>('t', 0.0389D),
            new WeightedItem<>('f', 0.0321D),
            new WeightedItem<>('u', 0.0298D),
            new WeightedItem<>('c', 0.0276D),
            new WeightedItem<>('h', 0.0241D),
            new WeightedItem<>('m', 0.0212D),
            new WeightedItem<>('b', 0.0184D),
            new WeightedItem<>('s', 0.0162D),
            new WeightedItem<>('p', 0.0131D),
            new WeightedItem<>('k', 0.0054D),
            new WeightedItem<>('j', 0.0021D),
            new WeightedItem<>('v', 0.0018D),
            new WeightedItem<>('z', 0.0009D),
            new WeightedItem<>('x', 0.0003D),
            new WeightedItem<>('q', 0.0001D)
    };
    @SuppressWarnings("unchecked")
    public static final WeightedItem<Character>[][] WEIGHTED_LETTERS = new WeightedItem[][]{
            AFRIKAANS_WEIGHTED_LETTERS,
            ENGLISH_WEIGHTED_LETTERS,
            GREEK_WEIGHTED_LETTERS,
            HAWAIIAN_WEIGHTED_LETTERS,
            LATIN_WEIGHTED_LETTERS,
            MARSHALLESE_WEIGHTED_LETTERS,
            SPANISH_WEIGHTED_LETTERS,
            WELSH_WEIGHTED_LETTERS
    };
    public static final String[] MIDDLE_CONSONANTS = {"bd", "bn", "bs", "bst", "cc", "ct", "dj", "ds", "gn", "lbr", "lf", "lm", "lp", "ls", "lt", "ltr", "mb", "mn", "mp", "ms", "nc", "nch", "nd", "ndr", "nf", "nfl", "nfr", "ng", "nj", "nk", "nl", "nm", "nn", "nr", "ns", "nsf", "nt", "ntr", "nv", "nz", "pc", "ps", "pt", "rb", "rc", "rd", "rg", "rj", "rl", "rm", "rn", "rp", "rr", "rs", "rt", "sb", "sc", "scr", "sf", "sfr", "sl", "sn", "sp", "ss", "st", "str", "xc", "xm", "xp", "xpr", "xt", "xtr"};
    public static final String[] ENDING_CONSONANTS = {"ng", "nn", "nt", "rn", "rsk", "rst", "rg", "st", "th", "tt"};
    public static final String[] CONSONANT_PAIRS = {"bl", "br", "ch", "cl", "cr", "dl", "dr", "fl", "fr", "gl", "gr", "kh", "kl", "kr", "ll", "pl", "pr", "rh", "sh", "tl", "tr", "vl", "vr"};
    public static final String[] EXTENDED_CONSONANT_PAIRS = {"bl", "br", "by", "ch", "cl", "cr", "cy", "dr", "dw", "fl", "fn", "fr", "fy", "gh", "gl", "gn", "gr", "gw", "gy", "hl", "hw", "hy", "kn", "kr", "ky", "ly", "ny", "ph", "pr", "ps", "py", "rh", "ry", "sc", "my", "sh", "sk", "sl", "sm", "sn", "sp", "sq", "st", "sw", "sy", "pl", "tp", "tr", "tw", "ty", "vy", "wh", "wl", "th", "vl", "wr", "wy", "yb", "yc", "yd", "yf", "yh", "yl", "ym", "yn", "yp", "yr", "ys", "yt", "yv", "yw"};
    public static final String[] VOWEL_PAIRS = {"ae", "ai", "ao", "au", "ea", "ei", "eo", "eu", "ia", "ie", "io", "iu", "oa", "oe", "oi", "ou", "ua", "ue", "ui", "uo"};
    public static final String[] STARTING_CONSONANTS = {"bh", "bj", "bl", "br", "by", "cc", "ch", "ck", "cl", "cn", "cr", "ct", "cy", "cz", "dd", "dh", "dm", "dn", "dr", "dw", "dy", "dz", "fl", "fr", "gh", "gl", "gm", "gn", "gr", "gs", "gw", "gy", "hj", "hl", "hm", "hn", "hr", "hs", "hw", "hy", "jd", "js", "jy", "kh", "kj", "kl", "kn", "kr", "kw", "ky", "ld", "lh", "lj", "ll", "lm", "ls", "lt", "lv", "ly", "mb", "mc", "ml", "mn", "mp", "mr", "my", "nc", "nd", "ng", "nn", "ns", "nt", "ny", "pf", "ph", "pl", "pr", "ps", "py", "rd", "rh", "rl", "rn", "rr", "rs", "rt", "rv", "rw", "ry", "sc", "sh", "sj", "sk", "sl", "sm", "sn", "sp", "sq", "sr", "ss", "st", "sv", "sw", "sy", "sz", "tc", "th", "tj", "tl", "tr", "ts", "tt", "tw", "ty", "tz", "vh", "vl", "vr", "vt", "vy", "wh", "wr", "ws", "wy", "xy", "yc", "yd", "yf", "yg", "yk", "yl", "ym", "yn", "ys", "yt", "yv", "yw", "zh", "zr", "zs", "zw", "zy"};
    public static final String[] NAME_PATTERNS = {"cv", "cvc", "cvc kvc", "cvcv", "cvccv", "cvcve", "cvcvc cvcve", "cvcvmv", "cvcvmve", "cve", "cvmce", "cvmv", "cvmve", "cvvc", "cvvcvcv", "cvvcvve", "cvve", "cwcvce", "cwcve", "cw cwcv", "cwe", "cwe cve", "cwecvcwe", "kvcv", "kvcve", "kve", "kvmv", "kvmvcv", "kvmvmv", "kwcv", "kwcve", "kwe", "kwmve", "vccv", "vccvc", "vccvcv", "vcv", "vcvc", "vcvccvc", "vcvcv", "vcvcvc", "vcvcvcv", "vcvcvcvc", "vcvcwcv", "vcve", "vcve vcw", "vmv", "vmvcv", "vmve", "vmvmv", "vmvmve", "wcv", "wcvcve", "wcve", "wmv", "wmvcv", "wmve", "?vcv", "?vcv ?vcv", "?vcvcv", "ɔvcv", "ɔwcv", "ɔvcvcw", "ɔvcvcwe"};
    public static final String[] FAMILY_NAME_SUFFIX = {"a", "ac", "acz", "aei", "ais", "aite", "aitis", "aj", "ak", "an", "and", "ange", "ants", "anu", "ar", "ard", "arz", "as", "aty", "au", "aud", "auskas", "auski", "avicius", "awan", "ay", "ba", "bach", "back", "backa", "backe", "baum", "beck", "bee", "begovic", "berg", "bergen", "berht", "bert", "boc", "bois", "borough", "bos", "bourg", "brook", "brun", "brunn", "burg", "burn", "burne", "by", "c", "cek", "chek", "chenka", "chenko", "chi", "chian", "chik", "chuk", "chyk", "ci", "cik", "cka", "ckas", "cki", "ckis", "ckiy", "cky", "ckyi", "cock", "cote", "cott", "cotte", "court", "cox", "craft", "croft", "cutt", "czak", "czek", "czuk", "czyk", "d", "dal", "dale", "dalle", "datter", "din", "do", "don", "dorf", "dotter", "dottir", "dun", "dze", "dzki", "e", "eanu", "eau", "eault", "ec", "ee", "eff", "eiro", "ek", "el", "ell", "ellu", "ema", "ems", "enas", "enka", "enko", "ens", "ent", "ents", "er", "ers", "es", "escu", "ese", "et", "ettu", "eu", "ev", "eva", "evic", "evich", "evicius", "evics", "evska", "evski", "evych", "ewic", "ewicz", "ez", "faldt", "falt", "feldt", "felt", "ffy", "fi", "fia", "ford", "fors", "fort", "fy", "g", "gaard", "gard", "garth", "gate", "gawa", "gil", "gren", "haar", "han", "hard", "hoeven", "holm", "hoven", "i", "ia", "iak", "ian", "ic", "ich", "ici", "icius", "ics", "icz", "ides", "iene", "ier", "ig", "ik", "ikh", "in", "ina", "ing", "ino", "ipa", "ipha", "is", "ishin", "ishina", "isk", "iu", "ius", "iv", "j", "jian", "ka", "kan", "kawa", "ke", "ken", "kin", "kins", "ko", "kus", "kvist", "kyzy", "l", "la", "lay", "le", "lein", "ley", "li", "lin", "litz", "loo", "lu", "lund", "ly", "ma", "maa", "mae", "magi", "man", "mand", "mann", "maz", "men", "ment", "mets", "mond", "mont", "mund", "ne", "nejad", "nen", "nezhad", "nik", "nova", "novas", "novo", "ny", "nyi", "o", "off", "oglu", "ois", "ok", "on", "onis", "opoulos", "opulos", "os", "osz", "ot", "ots", "ou", "ouf", "oui", "ous", "ov", "ova", "ovic", "ovich", "ovics", "ovska", "ovski", "ovych", "ow", "owic", "owicz", "owski", "oy", "perin", "pern", "poor", "pour", "putra", "putri", "puu", "quetil", "quin", "quist", "qvist", "redge", "ridge", "rigg", "rud", "s", "saar", "salu", "schmid", "schmidt", "schmit", "schmitt", "sen", "sens", "sepp", "shvili", "ska", "skas", "skaya", "ski", "skis", "skiy", "sky", "skyi", "sma", "smith", "son", "ssen", "ssens", "sson", "stad", "stein", "sten", "stern", "str", "stra", "strom", "svard", "t", "ta", "tabar", "te", "ten", "thwait", "to", "toft", "ton", "tone", "tuit", "tzki", "tzky", "udottir", "uk", "ulea", "ulis", "unas", "uni", "unts", "us", "uson", "uulu", "velt", "verde", "vic", "vich", "vici", "vicius", "viciute", "vics", "vili", "ville", "vitz", "vych", "waite", "wala", "wan", "wati", "well", "white", "wi", "wic", "wicz", "witch", "witsch", "witz", "wood", "worth", "wright", "y", "yan", "ych", "ycz", "yk", "ykh", "ynas", "ysz", "yte", "zada", "zadegan", "zadeh"};
    public static final String[] FEMALE_NAME_SUFFIX = {"a", "aine", "ana", "e", "elle", "ene", "enne", "etta", "ette", "ia", "ie", "in", "ina", "ine", "ise", "ita"};
    public static final String[][] GENERATED_NAME_START = {
            {"a", "an", "as", "bra", "ce", "cen", "den", "e", "el", "en", "ghal", "gra", "i", "in", "is", "ka", "kan", "ken", "kha", "kra", "li", "me", "o", "os", "ren", "rha", "se", "sen", "te", "tra", "u", "ul", "un", "ze", "æ"},
            {"a", "a", "a", "a", "a", "ae", "ae", "ae", "ba", "ba", "ba", "be", "be", "be", "bi", "bi", "bi", "bla", "ble", "bli", "blo", "blu", "bo", "bo", "bo", "bra", "bre", "bri", "bro", "bru", "bu", "bu", "bu", "ca", "ca", "ca", "ce", "ce", "ce", "cha", "che", "chi", "cho", "chu", "ci", "ci", "ci", "cla", "cle", "cli", "clo", "clu", "co", "co", "co", "cra", "cre", "cri", "cro", "cru", "cu", "cu", "cu", "da", "da", "da", "de", "de", "de", "di", "di", "di", "dla", "dle", "dli", "dlo", "dlu", "do", "do", "do", "dra", "dre", "dri", "dro", "dru", "du", "du", "du", "e", "e", "e", "e", "e", "fa", "fa", "fa", "fe", "fe", "fe", "fi", "fi", "fi", "fla", "fle", "fli", "flo", "flu", "fo", "fo", "fo", "fra", "fre", "fri", "fro", "fru", "fu", "fu", "fu", "ga", "ga", "ga", "ge", "ge", "ge", "gi", "gi", "gi", "gla", "gle", "gli", "glo", "glu", "go", "go", "go", "gra", "gre", "gri", "gro", "gru", "gu", "gu", "gu", "gue", "gui", "güe", "güi", "ha", "he", "hi", "ho", "hu", "i", "i", "i", "i", "i", "ja", "ja", "ja", "je", "je", "je", "ji", "ji", "ji", "jo", "jo", "jo", "ju", "ju", "ju", "ka", "ka", "ke", "ke", "ki", "ki", "ko", "ko", "ku", "ku", "la", "la", "la", "le", "le", "le", "li", "li", "li", "li", "lla", "lle", "lli", "llo", "llu", "lo", "lo", "lo", "lu", "lu", "lu", "ma", "ma", "ma", "me", "me", "me", "mi", "mi", "mi", "mo", "mo", "mo", "mu", "mu", "mu", "na", "na", "na", "ne", "ne", "ne", "ni", "ni", "ni", "no", "no", "no", "nu", "nu", "nu", "o", "o", "o", "o", "o", "ou", "ou", "ou", "pa", "pa", "pa", "pe", "pe", "pe", "pi", "pi", "pi", "pla", "ple", "pli", "plo", "plu", "po", "po", "po", "pra", "pre", "pri", "pro", "pru", "pu", "pu", "pu", "que", "qui", "ra", "ra", "ra", "re", "re", "re", "ri", "ri", "ri", "ro", "ro", "ro", "ru", "ru", "ru", "sa", "sa", "sa", "se", "se", "se", "sha", "she", "shi", "sho", "shu", "si", "si", "si", "so", "so", "so", "su", "su", "su", "ta", "ta", "ta", "te", "te", "te", "ti", "ti", "ti", "tla", "tle", "tli", "tlo", "tlu", "to", "to", "to", "tra", "tre", "tri", "tro", "tru", "tu", "tu", "tu", "u", "u", "u", "u", "u", "va", "va", "va", "ve", "ve", "ve", "vi", "vi", "vi", "vo", "vo", "vo", "vu", "vu", "vu", "wa", "wa", "we", "we", "wi", "wi", "wo", "wo", "wu", "wu", "xa", "xe", "xi", "xo", "xu", "ya", "ya", "ye", "ye", "yi", "yi", "yo", "yo", "yu", "yu", "za", "za", "ze", "ze", "zi", "zi", "zo", "zo", "zu", "zu"},
            {"a", "au", "be", "ba", "da", "do", "dra", "dul", "e", "el", "ga", "gan", "gwen", "gwyn", "gyl", "ha", "i", "il", "ki", "kin", "la", "le", "li", "lo", "ma", "mae", "mal", "mir", "mla", "nae", "ne", "ni", "nu", "ny", "o", "rau", "sa", "sae", "sal", "san", "se", "sil", "syl", "ta", "tho", "ti", "ty", "u", "ua", "va", "vi", "vyr"},
            {"ba", "be", "bi", "bo", "bu", "ca", "ce", "che", "chi", "co", "cu", "da", "di", "do", "du", "ei", "fe", "fo", "fu", "ga", "ge", "gi", "go", "gu", "ho", "ie", "ja", "jai", "jo", "ka", "ke", "ki", "ku", "la", "le", "li", "lo", "lu", "ma", "mi", "mo", "mu", "na", "ne", "nei", "no", "nu", "pa", "pe", "pi", "po", "qi", "qu", "rai", "re", "rha", "rho", "ri", "ro", "rui", "se", "sha", "shu", "si", "so", "su", "ta", "ti", "to", "tu", "u", "ua", "ulo", "va", "ve", "vu", "wi", "xa", "xe", "xi", "xo", "ye", "yei", "yen", "yu", "za", "ze", "zha", "zho", "zi", "zo"}
    };
    public static final String[][] GENERATED_NAME_MIDDLE = {
            {"ba", "ce", "da", "de", "dho", "dra", "ga", "ge", "gen", "gha", "gi", "hla", "hlo", "ka", "kar", "ko", "ma", "na", "pa", "par", "ta", "tha", "va", "ve", "ze", "zhe"},
            {"", "", "", "", "", "", "", "ba", "ba", "ba", "be", "be", "be", "bi", "bi", "bi", "bla", "ble", "bli", "blo", "blu", "bo", "bo", "bo", "bra", "bre", "bri", "bro", "bru", "bu", "bu", "bu", "ca", "ca", "ca", "ce", "ce", "ce", "cha", "che", "chi", "cho", "chu", "ci", "ci", "ci", "cia", "cie", "cio", "ciu", "cla", "cle", "cli", "clo", "clu", "co", "co", "co", "cra", "cre", "cri", "cro", "cru", "cu", "cu", "cu", "da", "da", "da", "de", "de", "de", "di", "di", "di", "dia", "die", "dio", "diu", "dla", "dle", "dli", "dlo", "dlu", "do", "do", "do", "dra", "dre", "dri", "dro", "dru", "du", "du", "du", "fa", "fa", "fa", "fe", "fe", "fe", "fi", "fi", "fi", "fla", "fle", "fli", "flo", "flu", "fo", "fo", "fo", "fra", "fre", "fri", "fro", "fru", "fu", "fu", "fu", "ga", "ga", "ga", "ge", "ge", "ge", "gi", "gi", "gi", "gla", "gle", "gli", "glo", "glu", "gna", "gno", "go", "go", "go", "gra", "gre", "gri", "gro", "gru", "gu", "gu", "gu", "gue", "gui", "güe", "güi", "ha", "he", "hi", "ho", "hu", "ja", "ja", "ja", "je", "je", "je", "ji", "ji", "ji", "jo", "jo", "jo", "ju", "ju", "ju", "ka", "ka", "ke", "ke", "ki", "ki", "ko", "ko", "ku", "ku", "la", "la", "la", "lba", "lbo", "le", "le", "le", "li", "li", "li", "lla", "lle", "lli", "llo", "llu", "lma", "lmo", "lo", "lo", "lo", "lu", "lu", "lu", "ma", "ma", "ma", "me", "me", "me", "mi", "mi", "mi", "mo", "mo", "mo", "mu", "mu", "mu", "na", "na", "na", "nae", "nai", "nao", "nau", "ne", "ne", "ne", "ni", "ni", "ni", "nia", "nie", "nio", "niu", "no", "no", "no", "nu", "nu", "nu", "pa", "pa", "pa", "pe", "pe", "pe", "pi", "pi", "pi", "pla", "ple", "pli", "plo", "plu", "po", "po", "po", "pra", "pre", "pri", "pro", "pru", "pu", "pu", "pu", "que", "qui", "ra", "ra", "ra", "re", "re", "re", "ri", "ri", "ri", "ro", "ro", "ro", "rra", "rre", "rri", "rro", "rru", "ru", "ru", "ru", "sa", "sa", "sa", "se", "se", "se", "sha", "she", "shi", "sho", "shu", "si", "si", "si", "so", "so", "so", "su", "su", "su", "ta", "ta", "ta", "te", "te", "te", "ti", "ti", "ti", "tla", "tle", "tli", "tlo", "tlu", "to", "to", "to", "tra", "tre", "tri", "tro", "tru", "tu", "tu", "tu", "va", "va", "va", "ve", "ve", "ve", "vi", "vi", "vi", "vo", "vo", "vo", "vu", "vu", "vu", "wa", "wa", "we", "we", "wi", "wi", "wo", "wo", "wu", "wu", "xa", "xe", "xi", "xo", "xu", "ya", "ya", "ye", "ye", "yi", "yi", "yo", "yo", "yu", "yu", "za", "za", "ze", "ze", "zi", "zi", "zo", "zo", "zu", "zu", "ña", "ñe", "ñi", "ño", "ñu"},
            {"", "", "", "", "bri", "ci", "cia", "da", "di", "dil", "do", "dre", "dri", "dy", "dyr", "fyl", "fyr", "la", "lan", "li", "lin", "lir", "los", "lu", "ma", "mi", "mil", "mir", "na", "nae", "ni", "nim", "ny", "nya", "ra", "re", "rea", "ri", "rina", "rio", "ryn", "sa", "sar", "sil", "sur", "tar", "tau", "to", "tou", "ve", "vha", "vi", "vil", "zi", "zi", "zur"},
            {"be", "bi", "bo", "bu", "ca", "cha", "che", "co", "cu", "da", "de", "di", "do", "du", "ei", "fa", "fe", "fu", "ga", "ge", "go", "gu", "ho", "iu", "jai", "jho", "ji", "jo", "ka", "ke", "ki", "la", "le", "li", "lo", "lu", "ma", "mo", "na", "ne", "nei", "nu", "pa", "pe", "pi", "po", "qi", "qu", "ra", "rai", "rho", "ri", "ru", "sa", "se", "shu", "si", "so", "su", "ta", "te", "ti", "to", "tu", "u", "ulo", "va", "ve", "vi", "vu", "wa", "wo", "xa", "xe", "xi", "xo", "xu", "ye", "yen", "yo", "yu", "za", "ze", "zei", "zhi", "zi", "zo", "zu"}
    };
    public static final String[][] GENERATED_NAME_ENDING = {
            {"drin", "gen", "ghar", "gra", "kan", "ken", "kin", "ko", "kyo", "ma", "na", "nen", "nia", "nin", "rar", "ria", "rin", "rio", "rion", "ryo", "ryon", "til", "vka", "vkin", "vko", "vrin", "vyon", "zen", "zin"},
            {"ba", "ba", "ba", "be", "be", "be", "bel", "bela", "bi", "bi", "bi", "bia", "bio", "bla", "ble", "bli", "blo", "blu", "bo", "bo", "bo", "bra", "bre", "bri", "bro", "bru", "bu", "bu", "bu", "ca", "ca", "ca", "ce", "ce", "ce", "cha", "che", "chi", "cho", "chu", "ci", "ci", "ci", "cia", "ciana", "ciano", "cio", "cion", "cla", "cle", "cli", "clo", "clu", "co", "co", "co", "cra", "cre", "cri", "crita", "crito", "cro", "cru", "cta", "cto", "cu", "cu", "cu", "da", "da", "da", "de", "de", "de", "dea", "deo", "des", "di", "di", "di", "dia", "dio", "dios", "dla", "dle", "dli", "dlo", "dlu", "dna", "dno", "do", "do", "do", "don", "dona", "dor", "dora", "dra", "dra", "dre", "dri", "dro", "dro", "dru", "du", "du", "du", "fa", "fa", "fa", "fas", "fe", "fe", "fe", "fi", "fi", "fi", "fla", "fle", "fli", "flo", "flu", "fo", "fo", "fo", "fra", "fre", "fri", "fro", "fru", "fu", "fu", "fu", "ga", "ga", "ga", "ge", "ge", "ge", "gi", "gi", "gi", "gla", "gle", "gli", "glo", "glu", "gna", "gno", "go", "go", "go", "gra", "gre", "gri", "gro", "gru", "gu", "gu", "gu", "gue", "gui", "güe", "güi", "ha", "he", "hi", "ho", "hu", "ja", "ja", "ja", "je", "je", "je", "ji", "ji", "ji", "jo", "jo", "jo", "ju", "ju", "ju", "ka", "ka", "ke", "ke", "ki", "ki", "ko", "ko", "ku", "ku", "l", "l", "l", "la", "la", "la", "lba", "lbo", "lda", "ldo", "le", "le", "le", "lea", "leo", "li", "li", "li", "lia", "liano", "lina", "lino", "lio", "lla", "lle", "lli", "llo", "llu", "lma", "lmo", "lo", "lo", "lo", "lon", "lona", "lu", "lu", "lu", "ma", "ma", "ma", "me", "me", "me", "mi", "mi", "mi", "mia", "min", "mina", "mio", "mo", "mo", "mo", "mu", "mu", "mu", "n", "n", "n", "n", "na", "na", "na", "nca", "ncia", "ncio", "nco", "nda", "ndo", "ne", "ne", "ne", "ni", "ni", "ni", "nia", "nio", "no", "no", "no", "nsa", "nso", "nta", "nto", "nu", "nu", "nu", "pa", "pa", "pa", "pe", "pe", "pe", "pi", "pi", "pi", "pla", "ple", "pli", "plo", "plu", "po", "po", "po", "pra", "pre", "pri", "pro", "pru", "pu", "pu", "pu", "que", "qui", "r", "r", "r", "r", "ra", "ra", "ra", "rda", "rda", "rdo", "rdo", "re", "re", "re", "rea", "reo", "res", "ri", "ri", "ri", "ria", "riana", "riano", "rio", "ro", "ro", "ro", "rra", "rrat", "rre", "rri", "rro", "rru", "rta", "rta", "rto", "rto", "ru", "ru", "ru", "s", "s", "s", "s", "sa", "sa", "sa", "sar", "sara", "sca", "sco", "se", "se", "se", "sha", "she", "shi", "sho", "shu", "si", "si", "si", "sia", "sio", "sme", "so", "so", "so", "su", "su", "su", "ta", "ta", "ta", "tan", "tano", "te", "te", "te", "tea", "teo", "ti", "ti", "ti", "tian", "tiana", "tilde", "tin", "tina", "tla", "tle", "tli", "tlo", "tlu", "to", "to", "to", "tra", "tre", "tri", "triz", "tro", "tru", "tu", "tu", "tu", "va", "va", "va", "ve", "ve", "ve", "vi", "vi", "vi", "via", "vio", "vo", "vo", "vo", "vu", "vu", "vu", "wa", "wa", "we", "we", "wi", "wi", "wo", "wo", "wu", "wu", "xa", "xe", "xi", "xo", "xu", "ya", "ya", "ye", "ye", "yi", "yi", "yo", "yo", "yu", "yu", "z", "z", "z", "z", "za", "za", "ze", "ze", "zi", "zi", "zo", "zo", "zon", "zona", "zu", "zu", "ña", "ñe", "ñi", "ño", "ñu"},
            {"baus", "dam", "dar", "dha", "dhae", "dho", "dia", "dil", "dio", "dor", "dra", "drian", "driel", "druth", "dur", "dyl", "ema", "la", "lae", "len", "lis", "lien", "lynn", "mir", "mor", "myr", "na", "nae", "nar", "nia", "nil", "nio", "nna", "nni", "nor", "nya", "ra", "rae", "rail", "ran", "rea", "rean", "reon", "reus", "rhial", "ria", "riel", "ril", "rio", "ris", "rium", "ron", "ryn", "sa", "sil", "sila", "sin", "tael", "tha", "thaus", "the", "thur", "tra", "tur", "ver", "via", "vil", "vio", "vir", "vis", "vlis"},
            {"be", "bi", "bo", "bu", "ce", "cha", "che", "co", "cu", "da", "de", "di", "do", "du", "ei", "fa", "fe", "fu", "ge", "go", "gu", "ho", "ja", "jho", "ji", "jo", "ka", "ki", "la", "le", "li", "lo", "lu", "ma", "mi", "mo", "na", "ne", "nei", "nu", "pe", "pi", "po", "qi", "rai", "rho", "ro", "sa", "se", "shi", "shu", "si", "su", "ta", "ti", "to", "tu", "u", "ulo", "va", "ve", "vi", "vu", "wa", "wo", "xa", "xe", "xi", "xo", "ye", "yen", "yu", "za", "ze", "zhi", "zi", "zo", "zu"}
    };
    public static final String[][] GENERATED_FAMILY_NAME_SUFFIX = {
            {"gha", "gho", "kem", "kema", "ken", "kenna", "ma", "mi", "n", "na", "nem", "nema", "ni", "nma", "ra", "re", "rha", "rhin", "rho", "rin", "ten", "tenna", "zen", "zenna", "zha", "zho", "zya", "zya"},
            {"aba", "abe", "abi", "aca", "ach", "aco", "ada", "ade", "adi", "ado", "aga", "ago", "ahi", "ain", "aiz", "aja", "ajo", "ala", "ale", "ali", "all", "alo", "ama", "ami", "amo", "ana", "ane", "ani", "ano", "ans", "anu", "any", "anz", "ara", "ard", "ari", "aro", "art", "aru", "asa", "aso", "ata", "ate", "ati", "ato", "aujo", "ave", "aya", "ayo", "aza", "azo", "bal", "ban", "bar", "bas", "bel", "bes", "bez", "bia", "bon", "bra", "cal", "can", "cas", "cea", "ces", "cha", "che", "chez", "chi", "cho", "cia", "cio", "ciu", "con", "cos", "dad", "dal", "dan", "dar", "das", "dea", "der", "des", "dez", "dia", "din", "dina", "dino", "dio", "don", "dor", "dos", "dra", "dro", "ean", "eca", "ech", "eco", "eda", "edo", "ega", "egi", "ego", "eja", "ejo", "ela", "ell", "elo", "ena", "eno", "ens", "ent", "er", "era", "eri", "ero", "ert", "esa", "eso", "eta", "ete", "eto", "eva", "ez", "eza", "gal", "gan", "gas", "ger", "ges", "gil", "gon", "gos", "gua", "gue", "guer", "guez", "gui", "hal", "han", "har", "hea", "her", "hir", "hou", "ia", "ian", "ias", "ibi", "ica", "ich", "ico", "ida", "ide", "idi", "ido", "iel", "ier", "ies", "iga", "igo", "ijo", "ila", "ili", "imi", "ina", "ine", "ini", "ino", "ion", "ios", "ira", "ire", "iri", "iro", "is", "isa", "iso", "ita", "iti", "ito", "iuc", "iva", "iz", "iza", "izo", "jar", "jas", "jon", "jos", "la", "lah", "lal", "lan", "lar", "las", "lat", "lda", "lde", "ldo", "lea", "ler", "les", "let", "lez", "li", "lia", "lin", "lio", "lis", "lla", "lle", "lli", "llo", "lls", "lo", "lon", "los", "lta", "lva", "man", "mar", "mas", "med", "mes", "mil", "min", "mon", "mpa", "na", "nal", "nas", "nau", "nca", "nce", "nco", "nda", "nde", "ndi", "ndo", "nea", "ner", "nes", "net", "nez", "nga", "ngo", "nis", "niz", "no", "nos", "nov", "nta", "nte", "nto", "nza", "nzo", "oba", "oca", "oiu", "ola", "oli", "olo", "ols", "ona", "oni", "ons", "ora", "oro", "ort", "osa", "oso", "ota", "ote", "oto", "oud", "ouh", "oui", "ouk", "oul", "oun", "our", "out", "ova", "oya", "oyo", "oza", "pez", "que", "qui", "ra", "ral", "ran", "ras", "rat", "ray", "raz", "rca", "rda", "rdi", "rdo", "rea", "ren", "res", "ret", "rey", "rez", "rga", "ria", "rin", "rio", "ris", "riu", "riz", "rna", "ron", "ronda", "rondo", "ros", "rra", "rre", "rri", "rro", "rta", "rte", "rto", "rza", "san", "sar", "sas", "sca", "sco", "scu", "sen", "ses", "sio", "son", "ssa", "ssi", "sta", "ste", "sti", "sto", "tal", "tan", "tar", "tas", "tea", "tel", "ter", "tes", "tia", "tin", "to", "ton", "tor", "tos", "tra", "tre", "tro", "tti", "uan", "ubi", "uca", "uch", "udi", "udo", "uel", "uer", "ues", "uet", "uez", "uin", "ula", "umi", "una", "uni", "ura", "uri", "uro", "uru", "usa", "uta", "uti", "uza", "val", "van", "vas", "ver", "ves", "via", "ya", "yan", "yes", "yo", "zan", "zar", "zas", "zo", "zon"},
            {"udaeus", "udalis", "udeus", "udhil", "udhur", "udyr", "udur", "udyl", "ufur", "ulden", "uldor", "uldur", "ulen", "ulenyr", "ulinor", "ulnur", "ulond", "ulur", "ulthur", "um", "umur", "umus", "umyr", "unden", "unor", "unor", "urde", "ureus", "urin", "uris", "urus", "uryn", "us", "ustur", "utur", "uvaeus", "uvaerus", "uvir", "uvur", "uvurus"},
            {"ban", "bao", "baq", "bex", "blax", "blen", "blia", "blo", "bran", "brax", "braz", "brel", "brex", "brez", "brix", "brox", "cai", "cax", "cian", "civ", "dan", "dax", "dej", "dia", "dio", "dor", "dox", "dra", "dran", "dre", "dria", "droj", "dron", "drox", "droz", "fen", "fia", "flax", "fliv", "fra", "frak", "frip", "fro", "froq", "gan", "geon", "greb", "gron", "grux", "hask", "jia", "jor", "jov", "jox", "jun", "jux", "jyx", "kai", "keo", "kep", "kia", "kib", "kin", "klaft", "klax", "klef", "krei", "krez", "krox", "krux", "lan", "lant", "laq", "lax", "len", "leo", "lio", "liq", "lon", "lor", "lun", "luo", "mij", "mox", "mun", "muz", "nao", "nex", "nia", "nio", "nox", "noz", "nraz", "nux", "nyx", "pan", "peli", "pex", "phe", "pio", "pliv", "plux", "pran", "praz", "prux", "qan", "qil", "qio", "qip", "qua", "quix", "quo", "quoz", "rel", "rio", "riq", "rix", "rox", "ruq", "shan", "sia", "sio", "tara", "thon", "tix", "tran", "treo", "trix", "tron", "tyx", "vach", "vao", "var", "vash", "vax", "vaz", "vech", "vei", "veo", "vesh", "vex", "vez", "via", "vian", "vich", "vij", "vin", "vish", "vix", "viz", "vlax", "vlox", "vlux", "voch", "vosh", "vox", "voz", "vrex", "vun", "vych", "vysh", "vyx", "vyz", "wak", "wix", "wraz", "wrez", "xan", "xen", "xeo", "xia", "xil", "xin", "xon", "xul", "yib", "yox", "yug", "yuk", "yux", "zab", "zaq", "zar", "zara", "zax", "zei", "zen", "zeo", "zex", "zez", "zian", "zio", "zok", "zor", "zux", "zyx"}
    };
    public static final String[] USERNAME_PATTERNS = {"#{forename}-#{surname}", "#{forename}-#{surname}.#{job}", "#{forename}-#{surname}.#{job}_#{denominator}#{letter}", "#{forename}-#{surname}.#{job}_#{denominator}#{number}", "#{forename}-#{surname}.#{job}_#{year}", "#{forename}-#{surname}_#{job}", "#{forename}-#{surname}_#{job}.#{denominator}#{letter}", "#{forename}-#{surname}_#{job}.#{denominator}#{number}", "#{forename}-#{surname}_#{job}.#{year}", "#{forename}.#{surname}-#{job}", "#{forename}.#{surname}-#{job}_#{denominator}#{letter}", "#{forename}.#{surname}-#{job}_#{denominator}#{number}", "#{forename}.#{surname}-#{job}_#{year}", "#{forename}.#{surname}", "#{forename}.#{surname}_#{job}-#{denominator}#{letter}", "#{forename}.#{surname}_#{job}-#{denominator}#{number}", "#{forename}.#{surname}_#{job}-#{year}", "#{forename}.#{surname}_#{job}", "#{forename}_#{surname}-#{job}", "#{forename}_#{surname}-#{job}_#{denominator}#{letter}", "#{forename}_#{surname}-#{job}_#{denominator}#{number}", "#{forename}_#{surname}-#{job}_#{year}", "#{forename}_#{surname}", "#{forename}_#{surname}.#{job}-#{denominator}#{letter}", "#{forename}_#{surname}.#{job}-#{denominator}#{number}", "#{forename}_#{surname}.#{job}-#{year}", "#{forename}_#{surname}.#{job}"};

    private Constant() {
    }
}
