package spanish;

public final class Constant {
    public static final String ALPHABET = "abcdefghijklmnñopqrstuvwxyz";
    public static final String LOWERCASE_ALPHABET = "abcdefghijklmnñopqrstuvwxyz";
    public static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    public static final String LETTERS = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    public static final String VOWELS = "aeiouAEIOU";
    public static final String VOWELS_WITH_DIACRITIC = "áéíóúüÁÉÍÓÚÜ";
    public static final String ALL_VOWELS = "aáeéiíoóuúüAÁEÉIÍOÓUÚÜ";
    public static final String CONSONANTS = "bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
    public static final String CLASSES = "alquimista¶ arquero[a]¶ asesino[a]¶ bardo/trovadora¶ bárbaro[a]¶ caballero/amazona¶ cazador[a]¶ clérigo/sacerdotisa¶ curandero[a]¶ dragoon¶ druida¶ elementalista¶ escudero[a]¶ espadachín/espadachina¶ espadero[a]¶ exorcista¶ explorador[a]¶ guerrero[a]¶ hechicero[a]¶ ilusionista¶ ingeniero[a]¶ invocador[a]¶ jinete oscuro[a]¶ ladrón/ladrona¶ lancero[a]¶ mago[a]¶ mago[a] rojo[a]¶ magus¶ mercenario[a]¶ monje/peleadora¶ médico[a]¶ nigromante¶ ninja¶ oráculo¶ paladín¶ pícaro[a]¶ pirata¶ rastreador[a]¶ samurai¶ soldado¶ templario[a]¶ trasmutador[a]";
    public static final String[] ANONYMOUS_ANIMALS = {"caimán", "oso hormiguero", "armadillo", "uro", "ajolote", "tejón", "murciélago", "oso", "castor", "pez globo", "búfalo", "camello", "camaleón", "guepardo", "ardilla", "chinchilla", "chupacabras", "cormorán", "coyote", "cuervo", "dingo", "dinosaurio", "perro", "delfín", "dragón", "pato", "pulpo dumbo", "elefante", "hurón", "zorro", "rana", "jirafa", "ganso", "topo", "grizzly", "hámster", "erizo", "hipopótamo", "hiena", "chacal", "lebrílope", "íbice", "ifrit", "iguana", "canguro", "kiwi", "koala", "kraken", "lémur", "leopardo", "ligre", "león", "llama", "manatí", "visón", "mono", "alce", "narval", "Nyan Cat", "orangután", "nutria", "panda", "pingüino", "ornitorrinco", "pitón", "calabaza", "quagga", "quokka", "conejo", "mapache", "rinoceronte", "oveja", "musaraña", "mofeta", "loris lento", "ardilla", "tigre", "tortuga", "unicornio", "morsa", "lobo", "glotón", "wómbat"};
    public static final String[] TITLE_DEPARTMENT = {"Contabilidad", "Administración", "Desarrollo de Negocios", "Cumplimiento Normativo", "Servicio al Cliente", "Análisis de Datos", "Finanzas", "Recursos Humanos", "Tecnología de la Información", "Legal", "Mercadotecnia", "Operaciones", "Compras", "Producción", "Gestión de Proyectos", "Relaciones Públicas", "Control de Calidad", "Investigación y Desarrollo", "Ventas", "Cadena de Suministro", "Soporte Técnico", "Formación y Desarrollo", "Logística", "Salud y Seguridad", "Gestión de Productos", "Planificación Estratégica", "Comunicaciones", "Gestión de Instalaciones", "Gestión de Riesgos", "Responsabilidad Social Corporativa"};
    public static final String[] TITLE_DESCRIPTOR = {"Superior", "Senior", "Adjunto[a]", "Corporativo[a]", "Dinámico[a]", "Futuro[a]", "de Producto", "Nacional", "Regional", "Distrital", "Central", "Global", "del Cliente", "de Inversión", "Dinámico[a]", "Internacional", "Patrimonial", "Avanzado[a]", "Interno[a]", "Humano[a]", "Jefe[a]", "Principal", "Contractual"};
    public static final String[] TITLE_JOB = {"Supervisor[a]", "Asociado[a]", "Ejecutivo[a]", "Intermediario[a]", "Oficial", "Gerente", "Ingeniero[a]", "Especialista", "Director[a]", "Coordinador[a]", "Administrador[a]", "Arquitecto[a]", "Analista", "Diseñador[a]", "Planificador[a]", "Orquestador[a]", "Técnico[a]", "Desarrollador[a]", "Productor[a]", "Consultor[a]", "Asistente", "Facilitador[a]", "Agente", "Representante", "Estratega", "Editor[a]", "Capacitador[a]", "Socio[a]", "Reclutador[a]", "Auxiliar"};
    public static final String[] TITLE_LEVEL = {"Soluciones", "Programa", "Marca", "Seguridad", "Investigación", "Mercadotecnia", "Directivas", "Implementación", "Integración", "Funcionalidad", "Respuesta", "Integración", "Tácticas", "Identidad", "Mercados", "Grupo", "División", "Aplicaciones", "Optimización", "Operaciones", "Infraestructura", "Intranet", "Comunicaciones", "Web", "Marca", "Calidad", "Aseguramiento", "Movilidad", "Cuentas", "Integración", "Creatividad", "Configuración", "Rendición de Cuentas", "Interacciones", "Factores", "Usabilidad", "Métricas", "Atención", "Sistemas"};
    public static final String[] HONORIFICS = {"[Sr[,a]].", "[Srit[o,a]].", "D.[[,ª]]", "[Sr[,a]].", "[Dr[,a]].", "[Prof[,a]].", "[Lcd[o,a]].", "Ing.", "Dir.[[,ª]]", "[Pdt[e,a]]."};
    public static final String[] ROYAL_TITLES = {"[^bar[ón,onesa]]", "[^conde[,sa]]", "[^duque[,sa]]", "[^empera[dor,triz]]", "[^k[áiser,aiserin]]", "[^marqu[és,esa]]", "[^pap[a,isa]]", "[^pr[íncipe,incesa]]", "[^re[y,ina]]", "[^vizconde[,sa]]", "[^zar[,ina]]", "[^r[ex,ēgīna]]", "[^sult[án,ana]]"};
    public static final String[] RELATIONSHIP = {"una persona", "[un[,a]] [desconocid[o,a]]", "una persona relacionada con %s", "la pareja de %s", "[[el,la]] cónyuge de %s", "[[el,la]] [concubin[o,a]] de %s", "[[el,la]] mejor [amig[o,a]] de %s", "[[el,la]] peor [enemig[o,a]] de %s", "la persona más cercana a %s", "alguien que ofrece servicios a %s", "alguien que vende algo a %s", "alguien cercano a %s", "[un[,a]] amante de %s", "[un[,a]] familiar de %s", "[un[,a]] familiar [lejan[o,a]] de %s", "[un[,a]] colega de %s", "[un[,a]] [amig[o,a]] de %s", "[un[,a]] [enemig[o,a]] de %s", "[un[,a]] [buen[,a]] [amig[o,a]] de %s", "[un[,a]] camarada de %s", "[un[,a]] [compañer[o,a]] de %s", "[un[,a]] acompañante de %s", "[un[,a]] [compañer[o,a]] de equipo de %s", "[un[,a]] [compañer[o,a]] de trabajo de %s", "[un[,a]] [compañer[o,a]] de clases de %s", "[un[,a]] [compañer[o,a]] de cuarto de %s", "[un[,a]] [soci[o,a]] de %s", "[un[,a]] [client[e,a]] de %s", "[un[,a]] prospecto de %s", "[un[,a]] [conocid[o,a]] de %s", "[un[,a]] [vecin[o,a]] de %s", "[un[,a]] [seguidor[,a]] de %s", "[un[,a]] [observador[,a]] de %s", "[un[,a]] [aliad[o,a]] de %s", "[un[,a]] rival de %s", "[un[,a]] aprendiz de %s", "[un[,a]] [mentor[,a]] de %s"};
    public static final String[] UNSPECIFIC_RELATIONSHIP = {"[un[,a]] [amig[o,a]]", "[un[,a]] [enemig[o,a]]", "[un[,a]] familiar", "[un[,a]] [parient[e,a]] [lejan[o,a]]", "[un[,a]] [conocid[o,a]]", "[un[,a]] [vecin[o,a]]", "[un[,a]] [desconocid[o,a]]", "[un[,a]] [compañer[o,a]]", "[un[,a]] camarada", "[un[,a]] acompañante", "[un[,a]] amante", "[un[,a]] [seguidor[,a]]", "una persona relacionada con el trabajo", "[un[,a]] [soci[o,a]]", "[un[,a]] [colaborador[,a]]", "un tercero", "una persona cualquiera"};

    private Constant() {
    }
}
