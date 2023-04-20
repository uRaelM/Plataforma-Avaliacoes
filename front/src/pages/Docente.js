import "./Docente.css";

import { Link } from 'react-router-dom'

function Docente() {
    return (
        <body id="home">
            <section id="provas">
                <div className="btn-box">
                    <Link className="btn-criar" to={'/provas'}>Gerenciamento de Questões</Link>
                </div>
                <div>
                    <h3>Provas</h3>
                </div>
            </section>
            <section id="turmas">
                <div>
                    <h3 className="turma-header">Suas Turmas</h3>
                </div>
            </section>
        </body>
    )
}

export default Docente;