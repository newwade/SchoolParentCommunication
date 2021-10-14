package com.cg.spc.entities;

import javax.persistence.*;

import com.cg.spc.entities.enums.ConcernParty;
import com.cg.spc.entities.enums.ConcernType;

@Entity(name = "CONCERN_1")
public class Concern {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int concernId;

	private String concernDescription;
	private boolean resolved;

	@Enumerated(value = EnumType.STRING)
	@Column(name = "CONCERN_TYPE")
	private ConcernType concernType;

	@Enumerated(value = EnumType.STRING)
	@Column(name = "CONCERN_PARTY")
	private ConcernParty concernParty;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PARENT")
	private Parent parent;
	
	public ConcernType getConcernType() {
		return concernType;
	}

	public void setConcernType(ConcernType concernType) {
		this.concernType = concernType;
	}

	public ConcernParty getConcernParty() {
		return concernParty;
	}

	public void setConcernParty(ConcernParty concernParty) {
		this.concernParty = concernParty;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}



	public int getConcernId() {
		return concernId;
	}

	public void setConcernId(int concernId) {
		this.concernId = concernId;
	}

	public String getConcernDescription() {
		return concernDescription;
	}

	public void setConcernDescription(String concernDescription) {
		this.concernDescription = concernDescription;
	}

	public boolean isResolved() {
		return resolved;
	}

	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}

	/**
	 * @param concernId
	 * @param concernDescription
	 * @param resolved
	 * @param concernType
	 * @param concernParty
	 * @param parent
	 */
	public Concern(int concernId, String concernDescription, boolean resolved, ConcernType concernType,
			ConcernParty concernParty, Parent parent) {
		super();
		this.concernId = concernId;
		this.concernDescription = concernDescription;
		this.resolved = resolved;
		this.concernType = concernType;
		this.concernParty = concernParty;
		this.parent = parent;
	}

	public Concern() {
		super();
	}

}
