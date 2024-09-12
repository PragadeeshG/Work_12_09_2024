package com.test1;

public class PCEquitiesMarketGroup {
	private Integer equitiesMarketCode;
	private Integer frtbEffective;
	private String frtbEffectiveDate;
	private String frtbEquitiesMarketDesc;
	private String frtbEquitiesMarketShortDesc;
	private Integer frtbDecimalPositions;
	private String frtbEquitiesMarketSymbol;
	private String frtbEquitiesMarketScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PCEquitiesMarketGroup() {

	}

	public PCEquitiesMarketGroup(Integer equitiesMarketCode, Integer frtbEffective, String frtbEffectiveDate,
			String frtbEquitiesMarketDesc, String frtbEquitiesMarketShortDesc, Integer frtbDecimalPositions,
			String frtbEquitiesMarketSymbol, String frtbEquitiesMarketScale, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.equitiesMarketCode = equitiesMarketCode;
		this.frtbEffective = frtbEffective;
		this.frtbEffectiveDate = frtbEffectiveDate;
		this.frtbEquitiesMarketDesc = frtbEquitiesMarketDesc;
		this.frtbEquitiesMarketShortDesc = frtbEquitiesMarketShortDesc;
		this.frtbDecimalPositions = frtbDecimalPositions;
		this.frtbEquitiesMarketSymbol = frtbEquitiesMarketSymbol;
		this.frtbEquitiesMarketScale = frtbEquitiesMarketScale;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getEquitiesMarketCode() {
		return equitiesMarketCode;
	}

	public void setEquitiesMarketCode(Integer equitiesMarketCode) {
		this.equitiesMarketCode = equitiesMarketCode;
	}

	public Integer getFrtbEffective() {
		return frtbEffective;
	}

	public void setFrtbEffective(Integer frtbEffective) {
		this.frtbEffective = frtbEffective;
	}

	public String getFrtbEffectiveDate() {
		return frtbEffectiveDate;
	}

	public void setFrtbEffectiveDate(String frtbEffectiveDate) {
		this.frtbEffectiveDate = frtbEffectiveDate;
	}

	public String getFrtbEquitiesMarketDesc() {
		return frtbEquitiesMarketDesc;
	}

	public void setFrtbEquitiesMarketDesc(String frtbEquitiesMarketDesc) {
		this.frtbEquitiesMarketDesc = frtbEquitiesMarketDesc;
	}

	public String getFrtbEquitiesMarketShortDesc() {
		return frtbEquitiesMarketShortDesc;
	}

	public void setFrtbEquitiesMarketShortDesc(String frtbEquitiesMarketShortDesc) {
		this.frtbEquitiesMarketShortDesc = frtbEquitiesMarketShortDesc;
	}

	public Integer getFrtbDecimalPositions() {
		return frtbDecimalPositions;
	}

	public void setFrtbDecimalPositions(Integer frtbDecimalPositions) {
		this.frtbDecimalPositions = frtbDecimalPositions;
	}

	public String getFrtbEquitiesMarketSymbol() {
		return frtbEquitiesMarketSymbol;
	}

	public void setFrtbEquitiesMarketSymbol(String frtbEquitiesMarketSymbol) {
		this.frtbEquitiesMarketSymbol = frtbEquitiesMarketSymbol;
	}

	public String getFrtbEquitiesMarketScale() {
		return frtbEquitiesMarketScale;
	}

	public void setFrtbEquitiesMarketScale(String frtbEquitiesMarketScale) {
		this.frtbEquitiesMarketScale = frtbEquitiesMarketScale;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
