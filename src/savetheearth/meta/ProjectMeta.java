package savetheearth.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2013-10-05 14:37:16")
/** */
public final class ProjectMeta extends org.slim3.datastore.ModelMeta<savetheearth.model.Project> {

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project> detailedInfos = new org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project>(this, "detailedInfos", "detailedInfos");

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project> documentation = new org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project>(this, "documentation", "documentation");

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project> getInTouch = new org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project>(this, "getInTouch", "getInTouch");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Project, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Project, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project> presentation = new org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Project>(this, "presentation", "presentation");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Project, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Project, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ProjectMeta slim3_singleton = new ProjectMeta();

    /**
     * @return the singleton
     */
    public static ProjectMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProjectMeta() {
        super("Project", savetheearth.model.Project.class);
    }

    @Override
    public savetheearth.model.Project entityToModel(com.google.appengine.api.datastore.Entity entity) {
        savetheearth.model.Project model = new savetheearth.model.Project();
        model.setDetailedInfos(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("detailedInfos")));
        model.setDocumentation(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("documentation")));
        model.setGetInTouch(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("getInTouch")));
        model.setKey(entity.getKey());
        model.setPresentation(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("presentation")));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        savetheearth.model.Project m = (savetheearth.model.Project) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("detailedInfos", stringToText(m.getDetailedInfos()));
        entity.setUnindexedProperty("documentation", stringToText(m.getDocumentation()));
        entity.setUnindexedProperty("getInTouch", stringToText(m.getGetInTouch()));
        entity.setUnindexedProperty("presentation", stringToText(m.getPresentation()));
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        savetheearth.model.Project m = (savetheearth.model.Project) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        savetheearth.model.Project m = (savetheearth.model.Project) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        savetheearth.model.Project m = (savetheearth.model.Project) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        savetheearth.model.Project m = (savetheearth.model.Project) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        savetheearth.model.Project m = (savetheearth.model.Project) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDetailedInfos() != null){
            writer.setNextPropertyName("detailedInfos");
            encoder0.encode(writer, m.getDetailedInfos());
        }
        if(m.getDocumentation() != null){
            writer.setNextPropertyName("documentation");
            encoder0.encode(writer, m.getDocumentation());
        }
        if(m.getGetInTouch() != null){
            writer.setNextPropertyName("getInTouch");
            encoder0.encode(writer, m.getGetInTouch());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getPresentation() != null){
            writer.setNextPropertyName("presentation");
            encoder0.encode(writer, m.getPresentation());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected savetheearth.model.Project jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        savetheearth.model.Project m = new savetheearth.model.Project();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("detailedInfos");
        m.setDetailedInfos(decoder0.decode(reader, m.getDetailedInfos()));
        reader = rootReader.newObjectReader("documentation");
        m.setDocumentation(decoder0.decode(reader, m.getDocumentation()));
        reader = rootReader.newObjectReader("getInTouch");
        m.setGetInTouch(decoder0.decode(reader, m.getGetInTouch()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("presentation");
        m.setPresentation(decoder0.decode(reader, m.getPresentation()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}