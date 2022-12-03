fun main(args: Array<String>) {
    val prod = Product(1, "test", "test")
    pages(ProductPage(prod))
    pages(SimplePage("header", "content"))
}
fun pages(page: BasePage) {
    val render_1 = HTMLRender(page)
    render_1.renderPage()
    val render_2 = JsonRender(page)
    render_2.renderPage()
    val render_3 = XMLRender(page)
    render_3.renderPage()
}