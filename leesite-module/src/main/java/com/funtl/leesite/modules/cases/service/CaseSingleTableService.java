/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.funtl.leesite.modules.cases.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.funtl.leesite.common.persistence.Page;
import com.funtl.leesite.common.service.CrudService;
import com.funtl.leesite.modules.cases.entity.CaseSingleTable;
import com.funtl.leesite.modules.cases.dao.CaseSingleTableDao;

/**
 * 生成示例Service
 * @author Lusifer
 * @version 2017-05-05
 */
@Service
@Transactional(readOnly = true)
public class CaseSingleTableService extends CrudService<CaseSingleTableDao, CaseSingleTable> {

	public CaseSingleTable get(String id) {
		return super.get(id);
	}
	
	public List<CaseSingleTable> findList(CaseSingleTable caseSingleTable) {
		return super.findList(caseSingleTable);
	}
	
	public Page<CaseSingleTable> findPage(Page<CaseSingleTable> page, CaseSingleTable caseSingleTable) {
		return super.findPage(page, caseSingleTable);
	}
	
	@Transactional(readOnly = false)
	public void save(CaseSingleTable caseSingleTable) {
		super.save(caseSingleTable);
	}
	
	@Transactional(readOnly = false)
	public void delete(CaseSingleTable caseSingleTable) {
		super.delete(caseSingleTable);
	}
	
	
	
	
}