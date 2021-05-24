
SUMMARY = "A high-level Python Web framework that encourages rapid development and clean, pragmatic design."
HOMEPAGE = "https://www.djangoproject.com/"
AUTHOR = "Django Software Foundation <foundation@djangoproject.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f09eb47206614a4954c51db8a94840fa"

SRC_URI = "https://files.pythonhosted.org/packages/f2/a5/905c45599a599d8b66f2a572a384ffd29bf5482233ec701fd53d5f52a513/Django-3.2.3.tar.gz"
SRC_URI[md5sum] = "ec5fc12eabe33d0ccacc2f12ee43d1fe"
SRC_URI[sha256sum] = "13ac78dbfd189532cad8f383a27e58e18b3d33f80009ceb476d7fcbfc5dcebd8"

S = "${WORKDIR}/Django-3.2.3"

RDEPENDS_${PN} = "python3-asgiref python3-pytz python3-sqlparse"

inherit setuptools3
