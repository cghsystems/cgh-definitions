package net.cghsystems.definitions.domain

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/**
 * Represents a Definition Category. E.g A definition can be related to Java or Food. This is a mechanism to limit
 * searches and data displayed in views.
 *
 * @author: chris
 * @date: 06/12/2012
 */
@EqualsAndHashCode
@ToString
class DefinitionCategory {
    String id, name
}
