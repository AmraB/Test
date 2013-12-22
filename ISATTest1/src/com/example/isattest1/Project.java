package com.example.isattest1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
	public Korisnik ProjectCoordinator;
	public int PreparationNumber;
	public int WorkOrderNumber;
	public String Name;
	public String Description;
	public Date CreateDate;
	public Date EditDate;
	public Date StartDate;
	public Date EndDate;
	
	
	@SuppressWarnings("deprecation")
	public List<Project> GenerateProjectTestData(int kolicina)
	{
		List<Project> listaProjekata = new ArrayList<Project>();
		Korisnik k=new Korisnik("Korisnik");
		for(int i=0;i<kolicina;i++)
		{
			
			listaProjekata.add(new Project(k,i,(i+1),"Projekat"+i,"Opis"+i,
					new Date(2013, i, (i+3)),new Date(2013, i, (i+3)),new Date(2013, i, (i+3)),new Date(2013, i, (i+3))));
		}
		
		return listaProjekata;
	}
	
	public Korisnik getProjectCoordinator() {
		return ProjectCoordinator;
	}

	public void setProjectCoordinator(Korisnik projectCoordinator) {
		ProjectCoordinator = projectCoordinator;
	}

	public int getPreparationNumber() {
		return PreparationNumber;
	}

	public void setPreparationNumber(int preparationNumber) {
		PreparationNumber = preparationNumber;
	}

	public int getWorkOrderNumber() {
		return WorkOrderNumber;
	}

	public void setWorkOrderNumber(int workOrderNumber) {
		WorkOrderNumber = workOrderNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	public Date getEditDate() {
		return EditDate;
	}

	public void setEditDate(Date editDate) {
		EditDate = editDate;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public Project(Korisnik projectCoordinator, int preparationNumber,
			int workOrderNumber, String name, String description,
			Date createDate, Date editDate, Date startDate, Date endDate) {
		super();
		ProjectCoordinator = projectCoordinator;
		PreparationNumber = preparationNumber;
		WorkOrderNumber = workOrderNumber;
		Name = name;
		Description = description;
		CreateDate = createDate;
		EditDate = editDate;
		StartDate = startDate;
		EndDate = endDate;
	}

	
	
}
