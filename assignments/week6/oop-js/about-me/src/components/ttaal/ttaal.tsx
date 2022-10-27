import Fact from '../fact/fact';
//'../fact/Fact';
import './ttaal.css';

interface IPropsTTAAL{

}

function TTAAL(props: IPropsTTAAL) {

    // in general, data is retrieved from an API/backend
    const facts = [
        {
            id: 1,
            fact: 'I like cats',
            isTrue: 'truth'
        },
        {
            id: 2,
            fact: 'The cat you saw is my cat',
            isTrue: 'lie'
        },
        {
            id: 3,
            fact: 'My cats name is Oliver',
            isTrue: 'lie'
        },
        {
            id: 4,
            fact: 'I do not like cats',
            isTrue: 'lie'
        }
    ]

    return (
        <main>
            <h3>Multiple lies and One truth</h3>
            <table>
                {/* <Fact id={facts[0].id} fact={facts[0].fact} isTrue={facts[0].isTrue}  />
                <Fact id={facts[1].id} fact={facts[1].fact} isTrue={facts[1].isTrue}/>
                <Fact id={facts[2].id} fact={facts[2].fact} isTrue={facts[2].isTrue}/> */}
                {
                    facts.map( fact => (
                        <Fact id={fact.id} fact={fact.fact} isTrue={fact.isTrue}  />
                    ))
                }
            </table>
        </main>
    );
}

export default TTAAL;