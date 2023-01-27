select
	codigo,
	nome
from
	pessoa
where
	((in_codigo not is null and codigo = in_codigo) or
	(in_codigo is null)) and
	
	((in_nome not is null and nome = in_nome) or
	(in_nome is null))