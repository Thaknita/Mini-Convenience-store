
package com.springboot.minimartapi.role;

import com.springboot.minimartapi.auth.AuthRepo;
import com.springboot.minimartapi.user.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepo roleRepo;
    private final RoleMapper roleMapper;
    @Override
    public void createRole(RoleCreationDto roleCreationDto) {

      Role role =  roleMapper.fromRoleCreationDto(roleCreationDto);

      roleRepo.save(role);


    }

}
