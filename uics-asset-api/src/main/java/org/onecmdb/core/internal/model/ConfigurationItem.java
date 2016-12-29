/*
 * Lokomo OneCMDB - An Open Source Software for Configuration
 * Management of Datacenter Resources
 *
 * Copyright (C) 2006 Lokomo Systems AB
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 * 
 * Lokomo Systems AB can be contacted via e-mail: info@lokomo.com or via
 * paper mail: Lokomo Systems AB, Sv�rdv�gen 27, SE-182 33
 * Danderyd, Sweden.
 *
 */
package org.onecmdb.core.internal.model;

import org.onecmdb.core.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * <p>The basic, underlying, data container used in the system.</p> 
 */
public class ConfigurationItem implements ICi {

	@Override
	public String getDisplayNameExpression() {
		return null;
	}

	@Override
	public Set<IAttribute> getAttributeDefinitions() {
		return null;
	}

	@Override
	public IAttribute getAttributeDefinitionWithAlias(String alias) {
		return null;
	}

	@Override
	public Set<IAttribute> getAttributes() {
		return null;
	}

	@Override
	public List<IAttribute> getAttributesWithAlias(String alias) {
		return null;
	}

	@Override
	public IAttribute getAttributeWithId(ItemId attrId) {
		return null;
	}

	@Override
	public List<IAttribute> getAddableAttributes() {
		return null;
	}

	@Override
	public ICi getDerivedFrom() {
		return null;
	}

	@Override
	public Set<ICi> getOffsprings() {
		return null;
	}

	@Override
	public ItemId getId() {
		return null;
	}

	@Override
	public boolean isBlueprint() {
		return false;
	}

	@Override
	public String getUniqueName() {
		return null;
	}

	@Override
	public String getAlias() {
		return null;
	}

	@Override
	public IType getValueType() {
		return null;
	}

	@Override
	public String getAsString() {
		return null;
	}

	@Override
	public OutputStream asOutputStream() {
		return null;
	}

	@Override
	public String getDisplayName() {
		return null;
	}

	@Override
	public boolean isNullValue() {
		return false;
	}

	@Override
	public boolean isComplex() {
		return false;
	}

	@Override
	public String getIcon() {
		return null;
	}

	@Override
	public Object getAsJavaObject() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public IValue parseString(String s) {
		return null;
	}

	@Override
	public IValue parseInputStream(InputStream in) {
		return null;
	}

	@Override
	public IValueSelector getValueSelector() {
		return null;
	}

	@Override
	public IValue fromValue(IValue value) {
		return null;
	}

	@Override
	public ErrorObject validate(IValue v) {
		return null;
	}

	@Override
	public IValue getNullValue() {
		return null;
	}

	@Override
	public IPath<IType> getOffspringPath() {
		return null;
	}

	@Override
	public Set<IType> getAllOffspringTypes() {
		return null;
	}

	@Override
	public String getTemplatePath() {
		return null;
	}

	@Override
	public ICi getGroup() {
		return null;
	}

	@Override
	public boolean isDerivedFrom(ICi rootTrigger) {
		return false;
	}

	@Override
	public IPath<String> getDerivedPath() {
		return null;
	}

	@Override
	public Date getCreateTime() {
		return null;
	}

	@Override
	public Date getLastModified() {
		return null;
	}

	@Override
	public Object getAdapter(Class type) {
		return null;
	}
}
