package com.mindtree.verticalproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.verticalproject.entity.Vertical;

@Service
public interface VerticalService {

	/**
	 * @param vertical
	 */
	public void add(Vertical vertical);

	/**
	 * @return
	 */
	public List<Vertical> getAll();


	/**
	 * @param verticalName
	 * @param verticalId1
	 */
	public void update(String verticalName, int verticalId1);

	/**
	 * @param verticalId
	 * @return
	 */
	public Vertical updateVerticals(int verticalId);

	/**
	 * @param verticalId
	 * @param verticalName
	 * @return
	 */
	public Vertical updateDetails(int verticalId, String verticalName);

	/**
	 * @param verticalId
	 */
	public void deleteVertical(int verticalId);

}
