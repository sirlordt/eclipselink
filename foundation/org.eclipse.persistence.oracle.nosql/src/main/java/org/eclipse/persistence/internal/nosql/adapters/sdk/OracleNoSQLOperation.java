/*
 * Copyright (c) 2022 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation
package org.eclipse.persistence.internal.nosql.adapters.sdk;

/**
 * Defines the valid Oracle NoSQL operations.
 *
 * @author Radek Felcman
 * @since EclipseLink 4.0
 */
public enum OracleNoSQLOperation {
    GET, PUT, PUT_IF_ABSENT, PUT_IF_PRESENT, PUT_IF_VERSION, DELETE, DELETE_IF_VERSION, ITERATOR, ITERATOR_QUERY
}
