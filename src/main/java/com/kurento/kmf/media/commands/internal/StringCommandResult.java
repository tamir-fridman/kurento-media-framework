/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.kurento.kmf.media.commands.internal;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import com.kurento.kmf.common.exception.KurentoMediaFrameworkException;

public class StringCommandResult extends AbstractThriftSerializedCommandResult {

	private String result;

	public String getResult() {
		return this.result;
	}

	@Override
	protected void deserializeFromTProtocol(TProtocol pr) {
		try {
			result = pr.readString();
		} catch (TException e) {
			throw new KurentoMediaFrameworkException(e.getMessage(), e, 30000); // TODO
		}
	}

}
