package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {
	// 변수 선언
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
		builder.append("회원 번호 : ");
		builder.append(customerId);
		builder.append(" | 회원명 : ");
		builder.append(customerName);
		builder.append(" | 번호 : ");
		builder.append(phoneNum);
		return builder.toString();
	}

}