package savetheearth.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2013-10-05 14:37:16")
/** */
public final class ProjectPartnerMeta extends org.slim3.datastore.ModelMeta<savetheearth.model.ProjectPartner> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<savetheearth.model.ProjectPartner, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<savetheearth.model.ProjectPartner, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<savetheearth.model.ProjectPartner, org.slim3.datastore.ModelRef<savetheearth.model.Partner>, savetheearth.model.Partner> partnerRef = new org.slim3.datastore.ModelRefAttributeMeta<savetheearth.model.ProjectPartner, org.slim3.datastore.ModelRef<savetheearth.model.Partner>, savetheearth.model.Partner>(this, "partnerRef", "partnerRef", org.slim3.datastore.ModelRef.class, savetheearth.model.Partner.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<savetheearth.model.ProjectPartner, org.slim3.datastore.ModelRef<savetheearth.model.Project>, savetheearth.model.Project> projectRef = new org.slim3.datastore.ModelRefAttributeMeta<savetheearth.model.ProjectPartner, org.slim3.datastore.ModelRef<savetheearth.model.Project>, savetheearth.model.Project>(this, "projectRef", "projectRef", org.slim3.datastore.ModelRef.class, savetheearth.model.Project.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<savetheearth.model.ProjectPartner, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<savetheearth.model.ProjectPartner, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ProjectPartnerMeta slim3_singleton = new ProjectPartnerMeta();

    /**
     * @return the singleton
     */
    public static ProjectPartnerMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProjectPartnerMeta() {
        super("ProjectPartner", savetheearth.model.ProjectPartner.class);
    }

    @Override
    public savetheearth.model.ProjectPartner entityToModel(com.google.appengine.api.datastore.Entity entity) {
        savetheearth.model.ProjectPartner model = new savetheearth.model.ProjectPartner();
        model.setKey(entity.getKey());
        if (model.getPartnerRef() == null) {
            throw new NullPointerException("The property(partnerRef) is null.");
        }
        model.getPartnerRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("partnerRef"));
        if (model.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) is null.");
        }
        model.getProjectRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("projectRef"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        savetheearth.model.ProjectPartner m = (savetheearth.model.ProjectPartner) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        if (m.getPartnerRef() == null) {
            throw new NullPointerException("The property(partnerRef) must not be null.");
        }
        entity.setProperty("partnerRef", m.getPartnerRef().getKey());
        if (m.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) must not be null.");
        }
        entity.setProperty("projectRef", m.getProjectRef().getKey());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        savetheearth.model.ProjectPartner m = (savetheearth.model.ProjectPartner) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        savetheearth.model.ProjectPartner m = (savetheearth.model.ProjectPartner) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        savetheearth.model.ProjectPartner m = (savetheearth.model.ProjectPartner) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        savetheearth.model.ProjectPartner m = (savetheearth.model.ProjectPartner) model;
        if (m.getPartnerRef() == null) {
            throw new NullPointerException("The property(partnerRef) must not be null.");
        }
        m.getPartnerRef().assignKeyIfNecessary(ds);
        if (m.getProjectRef() == null) {
            throw new NullPointerException("The property(projectRef) must not be null.");
        }
        m.getProjectRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        savetheearth.model.ProjectPartner m = (savetheearth.model.ProjectPartner) model;
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
        savetheearth.model.ProjectPartner m = (savetheearth.model.ProjectPartner) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getPartnerRef() != null && m.getPartnerRef().getKey() != null){
            writer.setNextPropertyName("partnerRef");
            encoder0.encode(writer, m.getPartnerRef(), maxDepth, currentDepth);
        }
        if(m.getProjectRef() != null && m.getProjectRef().getKey() != null){
            writer.setNextPropertyName("projectRef");
            encoder0.encode(writer, m.getProjectRef(), maxDepth, currentDepth);
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected savetheearth.model.ProjectPartner jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        savetheearth.model.ProjectPartner m = new savetheearth.model.ProjectPartner();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("partnerRef");
        decoder0.decode(reader, m.getPartnerRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("projectRef");
        decoder0.decode(reader, m.getProjectRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}