package cn.linshio.service;

import cn.linshio.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional(
            timeout = 3
            //noRollbackFor = ArithmeticException.class
    )
    public void buyBook(Integer bookId, Integer userId) {
        //首先查询到需要购买的图书的价格
        Integer bookPrice = bookDao.getPriceByBookId(bookId);
        //买完书后还需要更新一下图书的库存量
        bookDao.updateStock(bookId);
        //然后购买图书，更新用户余额
        bookDao.updateBalance(userId, bookPrice);
        //System.out.println(1/0);
    }
}
