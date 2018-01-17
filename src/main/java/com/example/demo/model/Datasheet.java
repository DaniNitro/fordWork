package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datasheet")
public class Datasheet implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "Region")
	private String region;
	private Long CPSC;
	private String CPSC_Name;
	private Long PMT_Engineering_Commodity_ID;
	@Column(name = "Engineering_Commodity_Name")
	private String engineeringCommodityName;
	private Long PAF_UID;
	private String PAF_Name_Level;
	private Long Base_Part_Number;
	private String BPNO_Description;
	private String BPNO_Status;
	private Long BPNO_PAF_UID;
	private String Line_of_Usage;
	private Long Salt_Data_1_Target;
	private Long Salt_Data_2_Target;
	private Long Cost_Target;
	private Long Cost_Status;
	private Long Weight_Target;
	private Long Weight_Status;
	private Long Weight_Audit;
	private Long EDT_Target;
	private Long EDT_Status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Long getCPSC() {
		return CPSC;
	}
	public void setCPSC(Long cPSC) {
		CPSC = cPSC;
	}
	public String getCPSC_Name() {
		return CPSC_Name;
	}
	public void setCPSC_Name(String cPSC_Name) {
		CPSC_Name = cPSC_Name;
	}
	public Long getPMT_Engineering_Commodity_ID() {
		return PMT_Engineering_Commodity_ID;
	}
	public void setPMT_Engineering_Commodity_ID(Long pMT_Engineering_Commodity_ID) {
		PMT_Engineering_Commodity_ID = pMT_Engineering_Commodity_ID;
	}
	public String getEngineeringCommodityName() {
		return engineeringCommodityName;
	}
	public void setEngineeringCommodityName(String engineeringCommodityName) {
		this.engineeringCommodityName = engineeringCommodityName;
	}
	public Long getPAF_UID() {
		return PAF_UID;
	}
	public void setPAF_UID(Long pAF_UID) {
		PAF_UID = pAF_UID;
	}
	public String getPAF_Name_Level() {
		return PAF_Name_Level;
	}
	public void setPAF_Name_Level(String pAF_Name_Level) {
		PAF_Name_Level = pAF_Name_Level;
	}
	public Long getBase_Part_Number() {
		return Base_Part_Number;
	}
	public void setBase_Part_Number(Long base_Part_Number) {
		Base_Part_Number = base_Part_Number;
	}
	public String getBPNO_Description() {
		return BPNO_Description;
	}
	public void setBPNO_Description(String bPNO_Description) {
		BPNO_Description = bPNO_Description;
	}
	public String getBPNO_Status() {
		return BPNO_Status;
	}
	public void setBPNO_Status(String bPNO_Status) {
		BPNO_Status = bPNO_Status;
	}
	public Long getBPNO_PAF_UID() {
		return BPNO_PAF_UID;
	}
	public void setBPNO_PAF_UID(Long bPNO_PAF_UID) {
		BPNO_PAF_UID = bPNO_PAF_UID;
	}
	public String getLine_of_Usage() {
		return Line_of_Usage;
	}
	public void setLine_of_Usage(String line_of_Usage) {
		Line_of_Usage = line_of_Usage;
	}
	public Long getSalt_Data_1_Target() {
		return Salt_Data_1_Target;
	}
	public void setSalt_Data_1_Target(Long salt_Data_1_Target) {
		Salt_Data_1_Target = salt_Data_1_Target;
	}
	public Long getSalt_Data_2_Target() {
		return Salt_Data_2_Target;
	}
	public void setSalt_Data_2_Target(Long salt_Data_2_Target) {
		Salt_Data_2_Target = salt_Data_2_Target;
	}
	public Long getCost_Target() {
		return Cost_Target;
	}
	public void setCost_Target(Long cost_Target) {
		Cost_Target = cost_Target;
	}
	public Long getCost_Status() {
		return Cost_Status;
	}
	public void setCost_Status(Long cost_Status) {
		Cost_Status = cost_Status;
	}
	public Long getWeight_Target() {
		return Weight_Target;
	}
	public void setWeight_Target(Long weight_Target) {
		Weight_Target = weight_Target;
	}
	public Long getWeight_Status() {
		return Weight_Status;
	}
	public void setWeight_Status(Long weight_Status) {
		Weight_Status = weight_Status;
	}
	public Long getWeight_Audit() {
		return Weight_Audit;
	}
	public void setWeight_Audit(Long weight_Audit) {
		Weight_Audit = weight_Audit;
	}
	public Long getEDT_Target() {
		return EDT_Target;
	}
	public void setEDT_Target(Long eDT_Target) {
		EDT_Target = eDT_Target;
	}
	public Long getEDT_Status() {
		return EDT_Status;
	}
	public void setEDT_Status(Long eDT_Status) {
		EDT_Status = eDT_Status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BPNO_Description == null) ? 0 : BPNO_Description.hashCode());
		result = prime * result + ((BPNO_PAF_UID == null) ? 0 : BPNO_PAF_UID.hashCode());
		result = prime * result + ((BPNO_Status == null) ? 0 : BPNO_Status.hashCode());
		result = prime * result + ((Base_Part_Number == null) ? 0 : Base_Part_Number.hashCode());
		result = prime * result + ((CPSC == null) ? 0 : CPSC.hashCode());
		result = prime * result + ((CPSC_Name == null) ? 0 : CPSC_Name.hashCode());
		result = prime * result + ((Cost_Status == null) ? 0 : Cost_Status.hashCode());
		result = prime * result + ((Cost_Target == null) ? 0 : Cost_Target.hashCode());
		result = prime * result + ((EDT_Status == null) ? 0 : EDT_Status.hashCode());
		result = prime * result + ((EDT_Target == null) ? 0 : EDT_Target.hashCode());
		result = prime * result + ((Line_of_Usage == null) ? 0 : Line_of_Usage.hashCode());
		result = prime * result + ((PAF_Name_Level == null) ? 0 : PAF_Name_Level.hashCode());
		result = prime * result + ((PAF_UID == null) ? 0 : PAF_UID.hashCode());
		result = prime * result
				+ ((PMT_Engineering_Commodity_ID == null) ? 0 : PMT_Engineering_Commodity_ID.hashCode());
		result = prime * result + ((Salt_Data_1_Target == null) ? 0 : Salt_Data_1_Target.hashCode());
		result = prime * result + ((Salt_Data_2_Target == null) ? 0 : Salt_Data_2_Target.hashCode());
		result = prime * result + ((Weight_Audit == null) ? 0 : Weight_Audit.hashCode());
		result = prime * result + ((Weight_Status == null) ? 0 : Weight_Status.hashCode());
		result = prime * result + ((Weight_Target == null) ? 0 : Weight_Target.hashCode());
		result = prime * result + ((engineeringCommodityName == null) ? 0 : engineeringCommodityName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datasheet other = (Datasheet) obj;
		if (BPNO_Description == null) {
			if (other.BPNO_Description != null)
				return false;
		} else if (!BPNO_Description.equals(other.BPNO_Description))
			return false;
		if (BPNO_PAF_UID == null) {
			if (other.BPNO_PAF_UID != null)
				return false;
		} else if (!BPNO_PAF_UID.equals(other.BPNO_PAF_UID))
			return false;
		if (BPNO_Status == null) {
			if (other.BPNO_Status != null)
				return false;
		} else if (!BPNO_Status.equals(other.BPNO_Status))
			return false;
		if (Base_Part_Number == null) {
			if (other.Base_Part_Number != null)
				return false;
		} else if (!Base_Part_Number.equals(other.Base_Part_Number))
			return false;
		if (CPSC == null) {
			if (other.CPSC != null)
				return false;
		} else if (!CPSC.equals(other.CPSC))
			return false;
		if (CPSC_Name == null) {
			if (other.CPSC_Name != null)
				return false;
		} else if (!CPSC_Name.equals(other.CPSC_Name))
			return false;
		if (Cost_Status == null) {
			if (other.Cost_Status != null)
				return false;
		} else if (!Cost_Status.equals(other.Cost_Status))
			return false;
		if (Cost_Target == null) {
			if (other.Cost_Target != null)
				return false;
		} else if (!Cost_Target.equals(other.Cost_Target))
			return false;
		if (EDT_Status == null) {
			if (other.EDT_Status != null)
				return false;
		} else if (!EDT_Status.equals(other.EDT_Status))
			return false;
		if (EDT_Target == null) {
			if (other.EDT_Target != null)
				return false;
		} else if (!EDT_Target.equals(other.EDT_Target))
			return false;
		if (Line_of_Usage == null) {
			if (other.Line_of_Usage != null)
				return false;
		} else if (!Line_of_Usage.equals(other.Line_of_Usage))
			return false;
		if (PAF_Name_Level == null) {
			if (other.PAF_Name_Level != null)
				return false;
		} else if (!PAF_Name_Level.equals(other.PAF_Name_Level))
			return false;
		if (PAF_UID == null) {
			if (other.PAF_UID != null)
				return false;
		} else if (!PAF_UID.equals(other.PAF_UID))
			return false;
		if (PMT_Engineering_Commodity_ID == null) {
			if (other.PMT_Engineering_Commodity_ID != null)
				return false;
		} else if (!PMT_Engineering_Commodity_ID.equals(other.PMT_Engineering_Commodity_ID))
			return false;
		if (Salt_Data_1_Target == null) {
			if (other.Salt_Data_1_Target != null)
				return false;
		} else if (!Salt_Data_1_Target.equals(other.Salt_Data_1_Target))
			return false;
		if (Salt_Data_2_Target == null) {
			if (other.Salt_Data_2_Target != null)
				return false;
		} else if (!Salt_Data_2_Target.equals(other.Salt_Data_2_Target))
			return false;
		if (Weight_Audit == null) {
			if (other.Weight_Audit != null)
				return false;
		} else if (!Weight_Audit.equals(other.Weight_Audit))
			return false;
		if (Weight_Status == null) {
			if (other.Weight_Status != null)
				return false;
		} else if (!Weight_Status.equals(other.Weight_Status))
			return false;
		if (Weight_Target == null) {
			if (other.Weight_Target != null)
				return false;
		} else if (!Weight_Target.equals(other.Weight_Target))
			return false;
		if (engineeringCommodityName == null) {
			if (other.engineeringCommodityName != null)
				return false;
		} else if (!engineeringCommodityName.equals(other.engineeringCommodityName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Datasheet [id=" + id + ", region=" + region + ", CPSC=" + CPSC + ", CPSC_Name=" + CPSC_Name
				+ ", PMT_Engineering_Commodity_ID=" + PMT_Engineering_Commodity_ID + ", engineeringCommodityName="
				+ engineeringCommodityName + ", PAF_UID=" + PAF_UID + ", PAF_Name_Level=" + PAF_Name_Level
				+ ", Base_Part_Number=" + Base_Part_Number + ", BPNO_Description=" + BPNO_Description + ", BPNO_Status="
				+ BPNO_Status + ", BPNO_PAF_UID=" + BPNO_PAF_UID + ", Line_of_Usage=" + Line_of_Usage
				+ ", Salt_Data_1_Target=" + Salt_Data_1_Target + ", Salt_Data_2_Target=" + Salt_Data_2_Target
				+ ", Cost_Target=" + Cost_Target + ", Cost_Status=" + Cost_Status + ", Weight_Target=" + Weight_Target
				+ ", Weight_Status=" + Weight_Status + ", Weight_Audit=" + Weight_Audit + ", EDT_Target=" + EDT_Target
				+ ", EDT_Status=" + EDT_Status + "]";
	}
	
	
	
}
