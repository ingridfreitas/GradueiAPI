CREATE TABLE polocurso(
id int not null primary key auto_increment,
nota varchar(10),
link varchar(200),
polo_id int not null,
curso_id int not null);

INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/administracao.aspx', 1, 1);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/arquitetura_urbanismo.aspx', 1, 4);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.unip.br/cursos/graduacao/tradicionais/biomedicina.aspx', 1, 8);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/ciencia_computacao.aspx', 1, 12);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tradicionais/ciencias_biologicas.aspx', 1, 11);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tradicionais/comunicacao_social_publicidade.aspx', 1, 18);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://www.unip.br/cursos/graduacao/tecnologicos/design_grafico.aspx', 1, 21);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tecnologicos/gestao_recursos_humanos.aspx', 1, 44);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.unip.br/cursos/graduacao/tecnologicos/radiologia.aspx', 1, 61);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/direito.aspx', 1, 22);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://www.unip.br/cursos/graduacao/tradicionais/educacao_fisica.aspx', 1, 24);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tradicionais/enfermagem.aspx', 1, 25);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/engenharia_civil.aspx', 1, 73);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tradicionais/engenharia_controle_automacao.aspx', 1, 29);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/engenharia_mecanica.aspx', 1, 34);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tradicionais/farmacia.aspx', 1, 37);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/fisioterapia.aspx', 1, 40);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/jornalismo.aspx', 1, 46);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://www.unip.br/cursos/graduacao/tradicionais/letras_bacharelado_portugues_ingles.aspx', 1, 47);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://www.unip.br/cursos/graduacao/tradicionais/matematica.aspx', 1, 48);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/medicina_veterinaria.aspx', 1, 50);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tradicionais/nutricao.aspx', 1, 54);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('3', 'https://www.unip.br/cursos/graduacao/tradicionais/pedagogia.aspx', 1, 57);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://www.unip.br/cursos/graduacao/tradicionais/psicologia.aspx', 1, 58);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/administracao', 2, 1);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/arquitetura-e-urbanismo', 2, 4);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://unisagrado.edu.br/graduacao/artes', 2, 6);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/biomedicina', 2, 8);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/ciencia-da-computacao', 2, 12);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/ciencias-biologicas-bacharelado', 2, 11);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/ciencias-contabeis', 2, 13);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/design', 2, 21);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://unisagrado.edu.br/graduacao/design-de-moda', 2, 74);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/educacao-fisica', 2, 24);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/enfermagem', 2, 25);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/engenharia-agronomica', 2, 27);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://unisagrado.edu.br/graduacao/engenharia-ambiental-e-sanitaria', 2, 75);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/engenharia-civil', 2, 73);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://unisagrado.edu.br/site/conteudo/12771-engenharia-de-biotecnologia-e-bioprocessos.html', 2, 76);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://unisagrado.edu.br/graduacao/engenharia-de-computacao', 2, 28);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/engenharia-de-producao', 2, 77);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://unisagrado.edu.br/graduacao/engenharia-eletrica', 2, 30);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/engenharia-mecanica', 2, 34);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/engenharia-quimica', 2, 32);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://unisagrado.edu.br/graduacao/estetica-e-cosmetica', 2, 78);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/farmacia', 2, 37);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/fisioterapia', 2, 40);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/gastronomia', 2, 79);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/historia', 2, 45);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://unisagrado.edu.br/graduacao/jogos-digitais', 2, 80);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/jornalismo', 2, 46);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/letras-tradutor', 2, 47);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://unisagrado.edu.br/graduacao/matematica', 2, 48);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/nutricao', 2, 54);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/odontologia', 2, 56);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/pedagogia', 2, 57);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/psicologia', 2, 58);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/publicidade-e-propaganda', 2, 59);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('SN', 'https://unisagrado.edu.br/site/conteudo/12752-quimica-licenciatura.html', 2, 60);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('4', 'https://unisagrado.edu.br/graduacao/relacoes-internacionais', 2, 62);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/computacao/cursos-de-graduao/bacharelado-em-ciencia-da-computacao/', 3, 12);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/ciencias-biologicas/', 3, 11);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/fisica/cursos/fsica/apresentacaoteste/', 3, 39);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/matematica/graduacao/', 3, 48);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/fisica/cursos/meteorologia/', 3, 51);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/cursos/pedagogia/', 3, 57);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/psicologia', 3, 58);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/quimica/', 3, 60);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fc.unesp.br/#!/departamentos/computacao/cursos-de-graduao/bacharelado-em-sistemas-de-informacao/', 3, 67);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/exatas/engenharia-civil/', 3, 73);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/exatas/engenharia-de-producao/', 3, 77);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/exatas/engenharia-eletrica/', 3, 30);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/exatas/engenharia-mecanica/', 3, 34);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/humanidades/arquitetura-e-urbanismo/', 3, 4);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/humanidades/artes-visuais/', 3, 6);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/humanidades/comunicacao-radio-tv-e-internet/', 3, 18);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/humanidades/design/', 3, 21);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/humanidades/jornalismo/', 3, 46);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/exatas/fisica-medica/', 4, 81);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/exatas/engenharia-de-bioprocessos-e-biotecnologia/', 4, 76);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/biologicas/zootecnia/', 4, 72);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/biologicas/nutricao/', 4, 54);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/biologicas/medicina-veterinaria/', 4, 50);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/biologicas/engenharia-florestal/', 4, 35);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/biologicas/engenharia-agronomica/', 4, 27);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/biologicas/enfermagem/', 4, 25);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www2.unesp.br/portal#!/guiadeprofissoes/biologicas/ciencias-biomedicas/', 4, 11);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_adm.html', 5, 1);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_arq.html', 5, 4);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_bio.html', 5, 8);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_cie.html', 5, 13);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_di.html', 5, 22);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_efi.html', 5, 24);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_ea.html', 5, 27);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_ec.html', 5, 73);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_eco.html', 5, 28);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_ep.html', 5, 77);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_em.html', 5, 34);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_fa.html', 5, 37);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_fisio.html', 5, 40);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_vet.html', 5, 50);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_nut.html', 5, 54);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_odo.html', 5, 56);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_ped.html', 5, 57);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_psi.html', 5, 58);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://faculdadegalileu.com.br/paginas/curso_enf.html', 5, 25);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www1.fob.usp.br/', 6, 41);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://uspdigital.usp.br/jupiterweb/listarGradeCurricular?codcg=25&codcur=25012&codhab=0&tipo=N', 6, 49);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://uspdigital.usp.br/jupiterweb/jupCarreira.jsp?codmnu=8275', 6, 56);
INSERT INTO polocurso(nota, link, polo_id, curso_id) VALUES ('5', 'https://www.fmb.unesp.br/', 4, 49);