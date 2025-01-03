function Hello ({ color, name, isSpacial }) {
    return(
        <>
        <div style={{ color: color }}>{name}</div>
        {isSpacial ? <b>*</b>: null}
        안녕하세요{name}
        
        </>
    )
}
Hello.defaultProps = 
{
    name: '이름없음'
}
export default Hello;