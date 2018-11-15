package com.dahantc.api.shorturlDetail;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dahantc.api.bean.ShorturlDetail;
import com.dahantc.api.bean.ShorturlResult;
import com.dahantc.api.jsonutil.JSONUtil;

import net.sf.json.JSONObject;

public class ReceiveShorturlDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 674912768731946482L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = null;
		PrintWriter out = null;
		try {
			// 获取短地址详情
			message = request.getParameter("shorturl");

			if (null != message && !"".equals(message)) {
				System.out.println("接收到的数据：" + message);

				JSONObject result = new JSONObject();
				result.put("status", "success");
				response.setCharacterEncoding("UTF-8");
				out = response.getWriter();
				out.write(result.toString());
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			if (null != out) {
				out.close();
			}
			message = null;
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			doPost(request, response);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
		}
	}
}
