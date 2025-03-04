package de.metas.manufacturing.workflows_api.activity_handlers.receive.json;

import de.metas.handlingunits.HUPIItemProductId;
import de.metas.handlingunits.HuPackingInstructionsItemId;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import javax.annotation.Nullable;

@Value
public class JsonAggregateToNewLU
{
	@NonNull String luCaption;
	@Nullable String tuCaption;

	@NonNull HuPackingInstructionsItemId luPIItemId;
	@NonNull HUPIItemProductId tuPIItemProductId;

	@Builder
	@Jacksonized
	private JsonAggregateToNewLU(
			@NonNull final String luCaption,
			@Nullable final String tuCaption,
			@NonNull final HuPackingInstructionsItemId luPIItemId,
			@NonNull final HUPIItemProductId tuPIItemProductId)
	{
		this.luCaption = luCaption;
		this.tuCaption = tuCaption;
		this.luPIItemId = luPIItemId;
		this.tuPIItemProductId = tuPIItemProductId;
	}
}
