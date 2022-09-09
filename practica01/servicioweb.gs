// regresa de forma textual los parámetros leidos con get
  const doGet = (e = {}) => {
    const { parameter } = e;
    const { nombre , apellido, telefono, direccion } = parameter;
    const salida = `Bienvenido ${nombre} ${apellido} ${telefono} ${direccion}`;
    return ContentService.createTextOutput(salida);
  };

// regresa de forma textual los parámetros leidos con post
  const doPost = (e = {}) => {
    const { parameter } = e;
    const { nombre, apellido , telefono, direccion } = parameter;
    const salida = `Bienvenido ${nombre} ${apellido} ${telefono} ${direccion}`;
    return ContentService.createTextOutput(salida);
  };