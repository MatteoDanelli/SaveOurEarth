package savetheearth.service;

import java.util.List;
import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import savetheearth.meta.PartnerMeta;
import savetheearth.model.Partner;

import com.google.appengine.api.datastore.Transaction;


public class PartnerService {
    
    private PartnerMeta p = new PartnerMeta();
    
    
    public Partner insert(Map<String, Object> input) {
        Partner newPartner = new Partner();
        //Put the newPartner in the datastore
        BeanUtil.copy(input, newPartner);
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(newPartner);
        tx.commit();
        return newPartner;
    }

    public List<Partner> getPartnerList() {
        return Datastore.query(p).asList();
    }
}
