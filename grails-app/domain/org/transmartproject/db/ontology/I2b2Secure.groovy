package org.transmartproject.db.ontology

class I2b2Secure extends AbstractI2b2Metadata implements Serializable {

    static String backingTable = 'I2B2_SECURE'

    static mapping = {
        table         name: 'I2B2_SECURE', schema: 'I2B2METADATA'
        version       false

        /* hibernate needs an id, see
         * http://docs.jboss.org/hibernate/orm/3.3/reference/en/html/mapping.html#mapping-declaration-id
         */
        id          composite: ['fullName', 'name']

        AbstractI2b2Metadata.mapping.delegate = delegate
        AbstractI2b2Metadata.mapping()
	}

	static constraints = {
        cSynonymCd          nullable:   false

        AbstractI2b2Metadata.constraints.delegate = delegate
        AbstractI2b2Metadata.constraints()
	}

}
