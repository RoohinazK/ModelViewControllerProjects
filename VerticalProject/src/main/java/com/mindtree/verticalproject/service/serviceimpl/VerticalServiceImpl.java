package com.mindtree.verticalproject.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.verticalproject.entity.Vertical;
import com.mindtree.verticalproject.repository.VerticalRepository;
import com.mindtree.verticalproject.service.VerticalService;

@Service
public class VerticalServiceImpl implements VerticalService {

	@Autowired
	private VerticalRepository verticalRepository;

	@Override
	public void add(Vertical vertical) {
		verticalRepository.save(vertical);
	}

	@Override
	public List<Vertical> getAll() {
		return verticalRepository.findAll();
	}

	@Override
	public void update(String verticalName, int verticalId1) {
		Vertical vertical = verticalRepository.getOne(verticalId1);
		vertical.setVerticalName(verticalName);
		verticalRepository.save(vertical);
	}

	@Override
	public Vertical updateVerticals(int verticalId) {
		Vertical vertical = verticalRepository.getOne(verticalId);
		return vertical;
	}

	@Override
	public Vertical updateDetails(int verticalId, String verticalName) {
		Vertical vertical = verticalRepository.getOne(verticalId);
		vertical.setVerticalName(verticalName);
		return verticalRepository.save(vertical);
	}

	@Override
	public void deleteVertical(int verticalId) {
		verticalRepository.deleteById(verticalId);
	}
}