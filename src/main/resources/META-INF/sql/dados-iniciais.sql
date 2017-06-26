INSERT INTO `curso` (`id`, `descricao`) VALUES (1, 'Administração');
INSERT INTO `curso` (`id`, `descricao`) VALUES (2, 'Ciências Contábeis');
INSERT INTO `curso` (`id`, `descricao`) VALUES (3, 'Ciência da Computação');
INSERT INTO `curso` (`id`, `descricao`) VALUES (4, 'Comércio Exterior');
INSERT INTO `curso` (`id`, `descricao`) VALUES (5, 'Direito');
INSERT INTO `curso` (`id`, `descricao`) VALUES (6, 'Economia');
INSERT INTO `curso` (`id`, `descricao`) VALUES (7, 'Gestão de TI');
INSERT INTO `curso` (`id`, `descricao`) VALUES (8, 'Serviço Social');

INSERT INTO `professor` (`id`, `nome`, `login`, `senha`) VALUES (1, 'Tenorio', 'tenorio', '123456');
INSERT INTO `professor` (`id`, `nome`, `login`, `senha`) VALUES (2, 'Cleber', 'cleber', '123456');
INSERT INTO `professor` (`id`, `nome`, `login`, `senha`) VALUES (3, 'Cynara', 'cynara', '123456');

INSERT INTO `disciplina` (`id`, `descricao`, `turno`, `curso_id`, `professor_id`) VALUES (1, 'Teoria dos Grafos', 'NOTURNO', 3, 1);
INSERT INTO `disciplina` (`id`, `descricao`, `turno`, `curso_id`, `professor_id`) VALUES (2, 'Sistemas Operacionais', 'NOTURNO', 3, 1);
INSERT INTO `disciplina` (`id`, `descricao`, `turno`, `curso_id`, `professor_id`) VALUES (3, 'Linguagens Formais', 'NOTURNO', 3, 1);
INSERT INTO `disciplina` (`id`, `descricao`, `turno`, `curso_id`, `professor_id`) VALUES (4, 'Multimidia', 'NOTURNO', 3, 1);
INSERT INTO `disciplina` (`id`, `descricao`, `turno`, `curso_id`, `professor_id`) VALUES (5, 'IHC', 'NOTURNO', 3, 3);
INSERT INTO `disciplina` (`id`, `descricao`, `turno`, `curso_id`, `professor_id`) VALUES (6, 'Programação para Dispositivos Móveis', 'NOTURNO', 3, 2);

INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (1, '3', '18:50:00', '20:30:00', 6);
INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (2, '3', '20:30:00', '22:10:00', 6);

INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (3, '1', '20:30:00', '22:10:00', 2);
INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (4, '2', '20:30:00', '22:10:00', 2);

INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (5, '4', '18:50:00', '20:30:00', 1);
INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (6, '4', '20:30:00', '22:10:00', 3);
INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (7, '3', '20:30:00', '22:10:00', 3);
INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (8, '3', '18:50:00', '20:30:00', 1);

INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (9, '0', '20:30:00', '22:10:00', 5);
INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (10, '1', '20:30:00', '22:10:00', 5);

INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (11, '2', '18:50:00', '20:30:00', 4);
INSERT INTO `disciplina_horario`(`id`, `dia`, `inicio`, `fim`, `disciplina_id`) VALUES (12, '1', '18:50:00', '20:30:00', 4);


