/*
 * #%L
 * metasfresh-material-event
 * %%
 * Copyright (C) 2022 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.material.event;

import de.metas.util.JSONObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class JacksonMaterialEventSerializer
{
	public static final transient JacksonMaterialEventSerializer instance = new JacksonMaterialEventSerializer();

	private final JSONObjectMapper<MaterialEvent> delegate;

	private JacksonMaterialEventSerializer()
	{
		delegate = JSONObjectMapper.forClass(MaterialEvent.class);
	}

	public String toString(final MaterialEvent event)
	{
		return delegate.writeValueAsString(event);
	}

	public MaterialEvent fromString(final String eventStr)
	{
		return delegate.readValue(eventStr);
	}
}
