package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a Radar 
 * 
 *
 */
public class RadarImpl implements Radar{

    List<RadarContact> radarContacts;
	
	/**
	 *  Constructs a new Radar 
	 */
	public RadarImpl(){
		radarContacts = new ArrayList<>();
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {
		for (RadarContact radarContact : radarContacts) {
		    if (radarContact.getContactID().equals(contact.getContactID()))
		    {
		        radarContact.setBearing(contact.getBearing());
		        radarContact.setDistance(contact.getDistance());
		        return contact;
		    }
		}
		radarContacts.add(contact);
	    return radarContacts.get(radarContacts.lastIndexOf(contact));
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {
		for (RadarContact radarContact : radarContacts) {
		    if (radarContact.getContactID().equals(id) ) 
		        return radarContact;
		}
	    return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {
		
		return radarContacts.size();
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {
	    for (RadarContact radarContact : radarContacts) {
            if (radarContact.getContactID().equals(id) ) {
                radarContacts.remove(radarContacts.indexOf(radarContact));
                return radarContact;
            }
        }
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		return radarContacts;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
	    radarContacts.sort(comparator);
		return radarContacts;
	}

	
}
