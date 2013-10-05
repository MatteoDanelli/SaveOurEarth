package savetheearth.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;
    
    @Attribute(lob=true)
    private String presentation;
    
    @Attribute(lob=true)
    private String detailedInfos;
    
    @Attribute(lob=true)
    private String documentation;
    
    @Attribute(lob=true)
    private String getInTouch;
    
    @Attribute(persistent=false)
    private InverseModelListRef<ProjectPartner, Project> partnerRefList = 
        new InverseModelListRef<ProjectPartner, Project>(ProjectPartner.class, "projectRef", this);

    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Project other = (Project) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getDetailedInfos() {
        return detailedInfos;
    }

    public void setDetailedInfos(String detailedInfos) {
        this.detailedInfos = detailedInfos;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getGetInTouch() {
        return getInTouch;
    }

    public void setGetInTouch(String getInTouch) {
        this.getInTouch = getInTouch;
    }

    public InverseModelListRef<ProjectPartner, Project> getPartnerRefList() {
        return partnerRefList;
    }
}
