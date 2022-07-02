/*
 * Copyright (c) 2022 Otavio Santana and others
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License v2.0
 * w/Classpath exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.nosql.tck.entities.inheritance;

import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.DiscriminatorValue;
import jakarta.nosql.mapping.Entity;

@Entity
@DiscriminatorValue("SMS")
public class EmailNotification extends Notification {

    @Column
    private String email;

    @Override
    public String send() {
        return "Sending message to email sms to the email: " + email;
    }
}
