package de.metas.manufacturing.workflows_api.activity_handlers.receive.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import de.metas.common.util.CoalesceUtil;
import de.metas.handlingunits.HUPIItemProductId;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import org.adempiere.exceptions.AdempiereException;

import javax.annotation.Nullable;
import java.util.Optional;

@Value
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class JsonAggregateToLU
{
	@Nullable JsonAggregateToNewLU newLU;
	@Nullable JsonAggregateToExistingLU existingLU;

	@Builder
	@Jacksonized
	private JsonAggregateToLU(
			@Nullable final JsonAggregateToNewLU newLU,
			@Nullable final JsonAggregateToExistingLU existingLU)
	{
		if (CoalesceUtil.countNotNulls(newLU, existingLU) != 1)
		{
			throw new AdempiereException("One and only of the `newLU` or `existingLUBarcode` shall be specified.");
		}

		this.newLU = newLU;
		this.existingLU = existingLU;
	}

	public Optional<HUPIItemProductId> getTUPIItemProductId()
	{
		return CoalesceUtil.optionalOfFirstNonNullSupplied(
				() -> newLU != null ? newLU.getTuPIItemProductId() : null,
				() -> existingLU != null ? existingLU.getTuPIItemProductId() : null);
	}
}
