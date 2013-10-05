package savetheearth.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2013-10-05 14:37:16")
/** */
public final class PartnerMeta extends org.slim3.datastore.ModelMeta<savetheearth.model.Partner> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Partner, java.util.Date> createdDate = new org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Partner, java.util.Date>(this, "createdDate", "createdDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Partner, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Partner, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<savetheearth.model.Partner> name = new org.slim3.datastore.StringAttributeMeta<savetheearth.model.Partner>(this, "name", "name");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<savetheearth.model.Partner> nationality = new org.slim3.datastore.StringAttributeMeta<savetheearth.model.Partner>(this, "nationality", "nationality");

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Partner> presentation = new org.slim3.datastore.StringUnindexedAttributeMeta<savetheearth.model.Partner>(this, "presentation", "presentation");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Partner, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<savetheearth.model.Partner, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final PartnerMeta slim3_singleton = new PartnerMeta();

    /**
     * @return the singleton
     */
    public static PartnerMeta get() {
       return slim3_singleton;
    }

    /** */
    public PartnerMeta() {
        super("Partner", savetheearth.model.Partner.class);
    }

    @Override
    public savetheearth.model.Partner entityToModel(com.google.appengine.api.datastore.Entity entity) {
        savetheearth.model.Partner model = new savetheearth.model.Partner();
        model.setCreatedDate((java.util.Date) entity.getProperty("createdDate"));
        model.setKey(entity.getKey());
        model.setName((java.lang.String) entity.getProperty("name"));
        model.setNationality((java.lang.String) entity.getProperty("nationality"));
        model.setPresentation(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("presentation")));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        savetheearth.model.Partner m = (savetheearth.model.Partner) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("createdDate", m.getCreatedDate());
        entity.setProperty("name", m.getName());
        entity.setProperty("nationality", m.getNationality());
        entity.setUnindexedProperty("presentation", stringToText(m.getPresentation()));
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        savetheearth.model.Partner m = (savetheearth.model.Partner) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        savetheearth.model.Partner m = (savetheearth.model.Partner) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        savetheearth.model.Partner m = (savetheearth.model.Partner) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        savetheearth.model.Partner m = (savetheearth.model.Partner) model;
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
        savetheearth.model.Partner m = (savetheearth.model.Partner) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCreatedDate() != null){
            writer.setNextPropertyName("createdDate");
            encoder0.encode(writer, m.getCreatedDate());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getName() != null){
            writer.setNextPropertyName("name");
            encoder0.encode(writer, m.getName());
        }
        if(m.getNationality() != null){
            writer.setNextPropertyName("nationality");
            encoder0.encode(writer, m.getNationality());
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
    protected savetheearth.model.Partner jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        savetheearth.model.Partner m = new savetheearth.model.Partner();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("createdDate");
        m.setCreatedDate(decoder0.decode(reader, m.getCreatedDate()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("name");
        m.setName(decoder0.decode(reader, m.getName()));
        reader = rootReader.newObjectReader("nationality");
        m.setNationality(decoder0.decode(reader, m.getNationality()));
        reader = rootReader.newObjectReader("presentation");
        m.setPresentation(decoder0.decode(reader, m.getPresentation()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}