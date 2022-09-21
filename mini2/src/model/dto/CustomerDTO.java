package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {
	// ���� ����
	private int customerId;
	private String customerName;
	private int phoneNum;

	@Builder(builderMethodName = "customerDTOBuilder")
	public CustomerDTO(int customerId, String customerName, int phoneNum) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ȸ�� ��ȣ : ");
		builder.append(customerId);
		builder.append(" | ȸ���� : ");
		builder.append(customerName);
		builder.append(" | ��ȣ : ");
		builder.append(phoneNum);
		return builder.toString();
	}

}