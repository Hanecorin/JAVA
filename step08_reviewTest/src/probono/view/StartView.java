/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  StartView.java
 * DESC  : ���� Ŭ����
 * 		     �����, ������, ��ɱ�� ���� �� ���� ����Ǵ� ������Ʈ ���� �� CRUD ������ test�ϴ� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.model.dto.TalentDonationType;
import probono.service.TalentDonationProjectService;

public class StartView {
	
	public static void main(String[] args) {
		
		//�����
		//���, �����, �̸���, ����ϱ⸦ ����ϴ� ��ɱ�� ����
		Donator donator1 = new Donator(7369, "���ǻ�", "kimdoc@company.com", "������ó ������Ʈ");
		Donator donator2 = new Donator(7156, "�ſ���", "shin@company.com", "���帮�ݹ� ������Ʈ");
		Donator donator3 = new Donator(8012, "�̷���", "lee@company.com", "�����׷��� ������Ʈ");
		Donator donator4 = new Donator(7777, "�ڸ޳�", "parkdoc@company.com", "������ó ������Ʈ");
				
		//������
		//������ ��ȣ, �̸�, ����ó, ��� �ޱ⸦ ����ϴ� ��ɱ�� ����
		Beneficiary beneficiary1 = new Beneficiary(100, "�迬��", "010-111-1111", "������ó ������Ʈ");
		Beneficiary beneficiary2 = new Beneficiary(101, "�ھ�Ʈ", "010-222-2222", "���帮�ݹ� ������Ʈ");
		Beneficiary beneficiary3 = new Beneficiary(105, "�̰ǰ�", "010-555-5555", "�����׷��� ������Ʈ");
		Beneficiary beneficiary4 = new Beneficiary(103, "������", "010-333-3333", "������ó ������Ʈ");
		
		//��ɱ�� ����
		//����, Ȱ������, Ȱ������
		TalentDonationType schweitzer = new TalentDonationType("������ó ������Ʈ", "�Ƿ�, ����, �ǰ��� ���õ� �о�", "�ǻ�, ���ǻ�, ���ǻ�, ������ ������, ����ħ, ����, �߸����� �� �Ƿ� Ȱ���̳� �Ƿ� Ȱ���� ���� �Ŀ�, ����, �Ƿ� Ȱ�� ����, ��ü���� ���, ��������, ���� óġ��");
		TalentDonationType audreyHepbun = new TalentDonationType("���帮�ݹ� ������Ʈ", "��ȭ, ���� ���� �о�", "������, ��ȭ���� ���α׷� ����, ���ä����� �� ��ȸ����, ����, ����, ������, ����ũ��, ����, ��, Ȱ�� ķ���� ��");
		TalentDonationType motherTeresa = new TalentDonationType("�����׷��� ������Ʈ", "���ҵ��� �� ��ȸ���� �о�", "��ȸ���� ���� �ü���� ���� �� �Ŀ�, ���ų��� ����, �׷�Ȥ, ���� ������");
		TalentDonationType daddyLongLegs = new TalentDonationType("Ű�ٸ������� ������Ʈ", "���丵, ���, ����, �Ῥ �о�", "�Ῥ, ���, ����, �������н����� �� ������ȸ ����, ��������, �ɸ���� �� ���丵, ���, ����, �Ῥ�о�");
		TalentDonationType heracles = new TalentDonationType("���Ŭ���� ������Ʈ", "ü��, ���,��� ���� �о�", "ü��Ȱ�� �� ����, ������ ����, ����, ���, �����Ͼ, ��� ���� �� �ڹ���");
		
		//�����, �����ڰ� ���ε� ���� ����Ǵ� ��� ��� ������Ʈ
		//������Ʈ��, �����, ������, ��ɱ������, ������, ������, ��ɱ�� ���� ����
		TalentDonationProject schweitzerProject = new TalentDonationProject("01������ó", donator1, beneficiary1, schweitzer, "2022-03-31", "2022-04-03", "������ ���� ġ��");		
		TalentDonationProject audreyHepbunPorject = new TalentDonationProject("02���帮�ݹ�", donator2, beneficiary2, audreyHepbun, "2022-03-31", "2022-04-03", "���������� ����");
		TalentDonationProject motherTeresaProject = new TalentDonationProject("03�����׷���", donator3, beneficiary3, motherTeresa, "2022-03-31", "2022-04-03", "���� ���� �Ļ� ����");
				
		TalentDonationProjectService service = TalentDonationProjectService.getInstance();

		System.out.println("*** 01. Project ���� ***");
		service.donationProjectInsert(schweitzerProject);
		service.donationProjectInsert(audreyHepbunPorject);
		service.donationProjectInsert(motherTeresaProject);

		
		System.out.println("\n*** 02. ��� Project �˻� ***");
		TalentDonationProject [] allProbonoProject = service.getDonationProjectsList();		
		EndView.projectListView(allProbonoProject);	
		
		
		System.out.println("\n*** 03. '01������ó' Project �˻� ***");
		TalentDonationProject project = service.getDonationProject("01������ó");
		EndView.projectView(project);
		
		//��� ����� �����ϱ� 
		System.out.println("\n*** 04. '01������ó' Project�� ����� ����(����) �� �ش� Project �˻� ***");
		service.donationProjectUpdate("01������ó", donator4);
		
		project = service.getDonationProject("01������ó");
		EndView.projectView(project);
		
		
		//��� ������ �����ϱ� 
		System.out.println("\n*** 05. '01������ó' Project�� ������ ����(����) �� �ش� Project �˻� ***");
		service.beneficiaryProjectUpdate("01������ó", beneficiary4);
		
		project = service.getDonationProject("01������ó");
		EndView.projectView(project);
		
		
		//��� ����� �����ϱ� 
		System.out.println("\n*** 06. '01������ó' Project ���� �� ������ Project �˻� ***");
		service.donationProjectDelete("01������ó");
		
		project = service.getDonationProject("01������ó");
		EndView.projectView(project);
	}
}
