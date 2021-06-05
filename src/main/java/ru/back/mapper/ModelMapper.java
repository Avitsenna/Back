package ru.back.mapper;

public interface ModelMapper<Model, DTO> {
    DTO toDTO(Model model);
    Model toModel(DTO dto);
}
