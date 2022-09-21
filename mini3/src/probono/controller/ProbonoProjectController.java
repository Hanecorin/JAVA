package probono.controller;

import probono.model.ActivistDAO;
import probono.model.ProbonoDAO;
import probono.model.ProbonoProjectDAO;
import probono.model.entity.ProbonoProjectDTO;
import probono.view.RunningEndView;

public class ProbonoProjectController {

	// 모든 프로젝트 검색 로직
	public static void getAllProbonoProjects() {
		try {
			RunningEndView.projectListView(ProbonoProjectDAO.getAllProbonoProjects());
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("모든 프로젝트 검색 시 에러 발생");
		}
	}

	// 새로운 프로젝트 저장 로직
	public static void addProbonoProject(ProbonoProjectDTO probonoProject) {
		try {
			ProbonoProjectDAO.addProbonoProject(probonoProject);
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("모든 프로젝트 저장 시 에러 발생");
		}
	}

	// 모든 기부자 검색 로직
	public static void getAllActivists() throws Exception {
		try {
			RunningEndView.activistListView(ActivistDAO.getAllActivists());
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("모든 재능 기부자 검색 시 에러 발생");
		}
	}

	// 프로보노 아이디로 프로보노 목적 수정
	public static void updateProbono(String probonoId, String probonoPurpose) {
		try {
			ProbonoDAO.updateProbono(probonoId, probonoPurpose);
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("프로보노 id로 프로보노 목적 변경 오류");
		}
	}

	// 프로보노 정보 검색
	public static void getProbono(String probonoId) {
		try {
			RunningEndView.allView(ProbonoDAO.getProbono(probonoId));
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.showError("프로보노 id로 해당 프로보노 검색 오류 ");
		}
	}
}